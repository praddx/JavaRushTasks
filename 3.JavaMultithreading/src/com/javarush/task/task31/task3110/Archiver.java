package com.javarush.task.task31.task3110;

import com.javarush.task.task31.task3110.command.Command;
import com.javarush.task.task31.task3110.command.ExitCommand;
import com.javarush.task.task31.task3110.exception.WrongZipFileException;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * Created by Pradd on 30.10.2017.
 */
public class Archiver {

    public static void main(String[] args) throws Exception {

        Operation operation = null;

        /*try (BufferedReader consoleReader = new BufferedReader(new InputStreamReader(System.in))) {
            System.out.println("Введите полный пусть архива (включая имя файла): ");
            Path archivePath = Paths.get(consoleReader.readLine());
            ZipFileManager zipManager = new ZipFileManager(archivePath);
            System.out.println("Введите полный путь файла, который требуется заархивировать: ");
            Path fileToArchivePath = Paths.get(consoleReader.readLine());
            zipManager.createZip(fileToArchivePath);
        } catch (IOException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }*/

        //new ExitCommand().execute();

        do {
            try {
                operation = askOperation();
                /*if (operation == Operation.EXIT) {
                    break;
                }*/
                CommandExecutor.execute(operation);

            } catch (WrongZipFileException e) {
                ConsoleHelper.writeMessage("Вы не выбрали файл архива или выбрали неверный файл.");
            } catch (Exception e) {
                ConsoleHelper.writeMessage("Произошла ошибка. Проверьте введенные данные.");
            }
        } while (operation != Operation.EXIT);





    }

    public static Operation askOperation() throws IOException {
        ConsoleHelper.writeMessage("Выберите оперицию:");
        ConsoleHelper.writeMessage(Operation.CREATE.ordinal() + " - упаковать файлы в архив");
        ConsoleHelper.writeMessage(Operation.ADD.ordinal() + " - добавить файл в архив");
        ConsoleHelper.writeMessage(Operation.REMOVE.ordinal() + " - удалить файл из архива");
        ConsoleHelper.writeMessage(Operation.EXTRACT.ordinal() + " - распаковать архив");
        ConsoleHelper.writeMessage(Operation.CONTENT.ordinal() + " - просмотреть содержимое архива");
        ConsoleHelper.writeMessage(Operation.EXIT.ordinal() + " - выход");


        return Operation.values()[ConsoleHelper.readInt()];
    }
}




















