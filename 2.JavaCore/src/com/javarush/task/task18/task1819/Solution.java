package com.javarush.task.task18.task1819;

/* 
Объединение файлов
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader consoleReader = new BufferedReader(new InputStreamReader(System.in));

        String firstFile = consoleReader.readLine();
        String secondFile = consoleReader.readLine();

        FileInputStream firstFileReader = new FileInputStream(firstFile);
        byte[] firstFileBytes = new byte[firstFileReader.available()];
        firstFileReader.read(firstFileBytes);

//        firstFileReader.close();

        FileInputStream secondFileReader = new FileInputStream(secondFile);
        FileOutputStream firstFileWriter = new FileOutputStream(firstFile);

        byte[] secondFileBytes = new byte[secondFileReader.available()];
        secondFileReader.read(secondFileBytes);

        firstFileWriter.write(secondFileBytes);
        firstFileWriter.write(firstFileBytes);

        firstFileReader.close();
        secondFileReader.close();
        firstFileWriter.close();
    }
}
