package com.javarush.task.task19.task1926;

/* 
Перевертыши
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) {
        try (BufferedReader consoleReader = new BufferedReader(new InputStreamReader(System.in));
            BufferedReader fileReader = new BufferedReader(new FileReader(consoleReader.readLine()))) {
            String line;
            while (fileReader.ready()) {
                line = fileReader.readLine();
                StringBuilder builder = new StringBuilder(line);
                System.out.println(builder.reverse().toString());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
