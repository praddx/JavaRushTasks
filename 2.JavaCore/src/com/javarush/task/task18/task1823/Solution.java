package com.javarush.task.task18.task1823;

import java.io.*;
import java.util.HashMap;
import java.util.Map;
import java.util.SortedMap;
import java.util.TreeMap;

/* 
Нити и байты
*/

public class Solution {
    public static Map<String, Integer> resultMap = new HashMap<String, Integer>();

    public static void main(String[] args) throws IOException {

        BufferedReader consoleReader = new BufferedReader(new InputStreamReader(System.in));
        String filePath;
        while(!(filePath = consoleReader.readLine()).equals("exit")) {
            new ReadThread(filePath).start();
        }

        synchronized (resultMap) {
            for (Map.Entry<String, Integer> el : resultMap.entrySet()) {
                System.out.println(el.getKey() + "  " + el.getValue());
            }
        }

        consoleReader.close();

    }

    public static class ReadThread extends Thread {

        //private InputStream fileReader;
        private String fileName;
        private Map<Integer, Integer> sortedBytes = new HashMap<>();


        public ReadThread(String fileName) {
            //implement constructor body
            this.fileName = fileName;
        }
        // implement file reading here - реализуйте чтение из файла тут
        public void run() {
            try {
            InputStream fileReader = new FileInputStream(fileName);
            int simbol;
            int amount;
            int maxAmount = 0;


                while (fileReader.available() > 0) {
                    simbol = fileReader.read();

                    if (sortedBytes.containsKey(simbol)) {
                        amount = sortedBytes.get(simbol) + 1;
                        sortedBytes.replace(simbol, amount);
                        maxAmount = Math.max(maxAmount, amount);
                    } else {
                        sortedBytes.put(simbol, 1);
                    }
                }
                fileReader.close();

                synchronized (resultMap) {
                    for (Map.Entry<Integer, Integer> element : sortedBytes.entrySet()) {
                        if (element.getValue() == maxAmount) {
                            synchronized (resultMap) {
                                resultMap.put(fileName, element.getKey());
                            }
                        }
                    }
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
