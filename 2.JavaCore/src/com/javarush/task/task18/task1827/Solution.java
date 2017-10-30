package com.javarush.task.task18.task1827;

/* 
Прайсы
*/

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader consoleReader = new BufferedReader(new InputStreamReader(System.in));
        String filePath = consoleReader.readLine();
        BufferedReader fileReader = new BufferedReader(new FileReader(filePath));
        List<String> fileContents = new ArrayList<>();

        //byte[] idBytes = new byte[8];
        String line = "";
        while (fileReader.ready()) {
            line = fileReader.readLine();
            fileContents.add(line);
        }
        System.out.println(line);
        int lastId = Integer.parseInt(line.substring(0, 8).trim());

        fileReader.close();

        String newEntry = String.format(Locale.ENGLISH,"%-8d%-30s%-8.2f%-4s", lastId + 1, args[1], Double.parseDouble(args[2]), args[3]);
        fileContents.add(newEntry);

        BufferedWriter fileWriter = new BufferedWriter(new FileWriter(filePath));
        for (String element : fileContents) {
            fileWriter.write(element + "\n");
        }

        fileWriter.close();


    }
}
