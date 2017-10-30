package com.javarush.task.task18.task1826;

/* 
Шифровка
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        InputStream fileReader = new FileInputStream(args[1]);
        OutputStream fileWriter = new FileOutputStream(args[2]);
        int byteFromFile;

        if (args[0].equals("-e")) {
            while (fileReader.available() > 0) {
                byteFromFile = fileReader.read();
                fileWriter.write(byteFromFile + 3);
            }
        } else if (args[0].equals("-d")) {
            while (fileReader.available() > 0) {
                byteFromFile = fileReader.read();
                fileWriter.write(byteFromFile - 3);
            }
        }

        fileReader.close();
        fileWriter.close();
    }

}
