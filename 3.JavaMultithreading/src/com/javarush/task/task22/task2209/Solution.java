package com.javarush.task.task22.task2209;

import java.io.*;
import java.util.Arrays;

/*
Составить цепочку слов
*/
public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader consoleReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedReader fileReader = new BufferedReader(new FileReader(consoleReader.readLine()));
        consoleReader.close();
        StringBuilder contentsBuilder = new StringBuilder();
        String line;

        while ((line = fileReader.readLine()) != null) {
            contentsBuilder.append(line + " ");
        }
        String[] words = contentsBuilder.toString().split(" ");

        StringBuilder result = getLine(words);
        System.out.println(result.toString());
    }

    public static StringBuilder getLine(String... words) {
        StringBuilder result = new StringBuilder();
        if (words.length > 0) {
            Arrays.sort(words);
            result.append(words[0] + " ");
            for (int i = 0; i < words.length - 1; i++) {
                for (int j = i + 1; j < words.length; j++) {
                    if (words[i].substring(words[i].length() - 1, words[i].length()).equalsIgnoreCase(words[j].
                    substring(0, 1))) {

                    }
                }
            }
        }
        return result;
    }
}
