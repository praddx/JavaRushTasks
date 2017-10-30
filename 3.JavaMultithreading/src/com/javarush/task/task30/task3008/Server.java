package com.javarush.task.task30.task3008;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * Created by Pradd on 24.10.2017.
 */
public class Server {

    private static Map<String, Connection> connectionMap = new ConcurrentHashMap<>();

    private static class Handler extends Thread {
        private Socket socket;

        public Handler(Socket socket) {
            this.socket = socket;
        }

        //Метод отправляет запрос пользователю для регистрации имени в списке подключенных пользователей
        //Если пользователя с таким именем нету среди подключенных включает пользователя в список и отправляет
        //ему сообщение, что он подключен
        //возвращает имя пользователя
        private String serverHandshake(Connection connection) throws IOException, ClassNotFoundException {
            String userName = "";
            Message nameRequest = new Message(MessageType.NAME_REQUEST);
            connection.send(nameRequest);
            while (userName.isEmpty()) {
                Message userAnswer = connection.receive();
                if (userAnswer.getType() == MessageType.USER_NAME && !userAnswer.getData().isEmpty()
                        && !connectionMap.containsKey(userAnswer.getData())) {
                    connectionMap.put(userAnswer.getData(), connection);
                    userName = userAnswer.getData();
                    connection.send(new Message(MessageType.NAME_ACCEPTED));
                } else {
                    connection.send(nameRequest);
                }
            }


            return userName;
        }

        //Метод отправляет пользователю список всех подключенных к чату пользователей
        private void sendListOfUsers(Connection connection, String userName) throws IOException {
            for (Map.Entry<String, Connection> connectedUser : connectionMap.entrySet()) {
                if (!connectedUser.getKey().equals(userName))
                    connection.send(new Message(MessageType.USER_ADDED, connectedUser.getKey()));
            }
        }

        private void serverMainLoop(Connection connection, String userName) throws IOException, ClassNotFoundException {
            Message clientMessage;
            while (true) {
                clientMessage = connection.receive();
                if (clientMessage.getType() == MessageType.TEXT) {
                    String messageText = userName + ": " + clientMessage.getData();
                    Message userMessage = new Message(MessageType.TEXT, messageText);
                    sendBroadcastMessage(userMessage);
                } else {
                    ConsoleHelper.writeMessage("Error!");
                }
            }
        }

        public void run() {
            ConsoleHelper.writeMessage("Установлено новое соединение: " + socket.getRemoteSocketAddress());
            Connection newConnection = null;
            String userName = "";
            try {
                newConnection = new Connection(socket);
                userName = serverHandshake(newConnection);
                sendBroadcastMessage(new Message(MessageType.USER_ADDED, userName));
                sendListOfUsers(newConnection, userName);
                serverMainLoop(newConnection, userName);

            } catch (IOException e) {
                ConsoleHelper.writeMessage("Произошла ошибка при обмене данными с удаленным сервером");
            } catch (ClassNotFoundException e) {
                ConsoleHelper.writeMessage("Произошла ошибка при обмене данными с удаленным сервером");
            } finally {
                if (newConnection != null) {
                    try {
                        newConnection.close();

                    } catch (IOException e) {
                        ConsoleHelper.writeMessage("Произошла ошибка при закрытии соединения");
                    }
                }
                if (!userName.isEmpty()) {
                    connectionMap.remove(userName);
                    sendBroadcastMessage(new Message(MessageType.USER_REMOVED, userName));
                }
            }
            ConsoleHelper.writeMessage("Соединение с удаленным адресом закрыто");

        }

    }

    //Метод отправляет сообщение всем пользователям
    public static void sendBroadcastMessage(Message message) {
        for (Map.Entry<String, Connection> connection : connectionMap.entrySet()) {
            try {
                connection.getValue().send(message);
            } catch (IOException e) {
                System.out.println("Не получилось отправить сообщение пользователю - " + connection.getKey());
            }
        }
    }

    public static void main(String[] args) {
        ConsoleHelper consoleHelper = new ConsoleHelper();
        int serverPort = consoleHelper.readInt();
        ServerSocket serverSocket = null;
        try {
            serverSocket = new ServerSocket(serverPort);
            System.out.println("Server started");
            while (true) {
                new Handler(serverSocket.accept()).start();
            }
        } catch (Exception e) {
            System.out.println("Произошла шибка");
        } finally {
            if (serverSocket != null)
                try {
                    serverSocket.close();
                } catch (IOException e) {
                    System.out.println("Ошибка при закрытии serverSocket");
                }
        }
    }
}
