package com.javarush.task.task18.task1820;

/* 
Округление чисел
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader consoleReader = new BufferedReader(new InputStreamReader(System.in));
        String numberstFile = consoleReader.readLine();
        String roundedNumbers = consoleReader.readLine();

        BufferedReader numberstReader = new BufferedReader(new FileReader(numberstFile));
        FileWriter roundedWriter = new FileWriter(roundedNumbers);
        String line;
        String numbers = "";

        while ((line = numberstReader.readLine()) != null) {
            numbers += line + " ";
        }
        numberstReader.close();

         String[] toRound = numbers.split(" ");
        for (String el : toRound) {
            roundedWriter.write(new Integer(Math.round(Float.parseFloat(el))).toString() + " ");
        }


        roundedWriter.close();
    }
}
