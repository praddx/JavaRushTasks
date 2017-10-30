package com.javarush.task.task18.task1825;

import java.io.*;
import java.util.*;

/* 
Собираем файл
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader consoleReader = new BufferedReader(new InputStreamReader(System.in));
        String filePath = "";
//        List<OutputStream> writersList = new ArrayList<>();
        SortedMap<String, FileInputStream> readersMap = new TreeMap<>();


        while (!(filePath = consoleReader.readLine()).equals("end")) {
            //System.out.println(filePath);

            //FileInputStream inputStream = new FileInputStream(filePath);
            //System.out.println(true);
            readersMap.put(filePath, new FileInputStream(filePath));
        }
        consoleReader.close();
        filePath = readersMap.firstKey();
        String[] splittedPath = filePath.split("\\\\");
        String[] splittedName = splittedPath[splittedPath.length - 1].split("\\.");
        String completedFile = "";
            for(int i = 0; i < splittedPath.length - 1; i++) {
                completedFile += splittedPath[i] + "\\";
            }
        completedFile = completedFile + splittedName[0] + "." + splittedName[1];

        OutputStream fileWriter = new FileOutputStream(completedFile, true);

        for (Map.Entry<String, FileInputStream> element : readersMap.entrySet()) {
            byte[] bytes = new byte[element.getValue().available()];
            element.getValue().read(bytes);
            /*for (byte el : bytes) {
                System.out.println(el);
            }*/
            fileWriter.write(bytes);
            element.getValue().close();
        }

        fileWriter.close();
    }
}
