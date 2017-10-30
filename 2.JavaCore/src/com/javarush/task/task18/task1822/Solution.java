package com.javarush.task.task18.task1822;

/* 
Поиск данных внутри файла
*/

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader consoleReader = new BufferedReader(new InputStreamReader(System.in));
        String filePath = consoleReader.readLine();
        consoleReader.close();

        BufferedReader fileReader = new BufferedReader(new FileReader(filePath));
        String lineOfData;
        while ((lineOfData = fileReader.readLine()) != null) {
            if (lineOfData.startsWith(args[0])) {
                System.out.println(lineOfData);
                break;
            }
        }
        fileReader.close();

    }
}
