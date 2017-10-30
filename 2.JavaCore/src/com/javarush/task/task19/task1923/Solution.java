package com.javarush.task.task19.task1923;

/* 
Слова с цифрами
*/

import java.io.*;
import java.util.regex.Pattern;

public class Solution {
    public static void main(String[] args) {
        try (BufferedReader fileReader = new BufferedReader(new FileReader(args[0]));
             BufferedWriter fileWriter = new BufferedWriter(new FileWriter(args[1]))) {
            String line = "";
            while (fileReader.ready()) {
                line += fileReader.readLine();

            }

            String[] words = line.split(" ");
            for (int i = 0; i < words.length; i++) {
                if (Pattern.matches(".*\\d.*", words[i])) {
                    fileWriter.write(words[i] + " ");
                }
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
