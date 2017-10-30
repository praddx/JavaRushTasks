package com.javarush.task.task19.task1922;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

/* 
Ищем нужные строки
*/

public class Solution {
    public static List<String> words = new ArrayList<String>();

    static {
        words.add("файл");
        words.add("вид");
        words.add("В");
    }

    public static void main(String[] args) {
        List<String> lines = new ArrayList<>();
        try (BufferedReader consoleReader = new BufferedReader(new InputStreamReader(System.in));
             BufferedReader fileReader = new BufferedReader(new FileReader(consoleReader.readLine()))) {
           /* while (fileReader.ready()) {
                lines.add(fileReader.readLine());
            }
            int count;
            for (String line : lines) {
                count = 0;
                String[] splittedLine = line.split(" ");
                for (int i = 0; i < splittedLine.length; i++) {
                    if (splittedLine[i].equals(words.get(0)) || splittedLine[i].equals("вид") || splittedLine[i].equals("В")) {
                        count++;
                    }
                }
                if (count == 2) {
                    System.out.println(line);
                }
            }*/
           int count;
           String line;
           while (fileReader.ready()) {
               count = 0;
                line = fileReader.readLine();
                for (String word : words) {
                    if (line.contains(word)) {
                        count++;
                    }
                }
                if (count == 2) {
                    System.out.println(line);
                }
            }

        } catch (FileNotFoundException e1) {
            e1.printStackTrace();
        } catch (IOException e1) {
            e1.printStackTrace();
        }

    }
}
