package com.javarush.task.task18.task1817;

/* 
Пробелы
*/

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Solution {
    public static void main(String[] args) throws IOException {
        int numberOfsimbols;
        int numberOfSpaces = 0;
        //int simbol;
        FileInputStream fileReader = new FileInputStream(args[0]);
        numberOfsimbols = fileReader.available();
        while (fileReader.available() > 0) {
            if (fileReader.read() == 32) {
                numberOfSpaces++;
            }
        }
        fileReader.close();
        System.out.printf("%.2f", (double) numberOfSpaces / numberOfsimbols * 100);
    }
}
