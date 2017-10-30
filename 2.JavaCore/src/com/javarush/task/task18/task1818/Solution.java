package com.javarush.task.task18.task1818;

/* 
Два в одном
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader consoleReader = new BufferedReader(new InputStreamReader(System.in));
        String first = consoleReader.readLine();
        String second = consoleReader.readLine();
        String third = consoleReader.readLine();

        FileOutputStream firstFileWriter = new FileOutputStream(first);
        FileInputStream secondFileReader = new FileInputStream(second);
        FileInputStream thirdFileReader = new FileInputStream(third);

        while (secondFileReader.available() > 0) {
            firstFileWriter.write(secondFileReader.read());
        }

        while (thirdFileReader.available() > 0) {
            firstFileWriter.write(thirdFileReader.read());
        }

        firstFileWriter.close();
        secondFileReader.close();
        thirdFileReader.close();
    }
}
