package com.javarush.task.task19.task1925;

/* 
Длинные слова
*/

import java.io.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Solution {
    public static void main(String[] args) {
        try (BufferedReader fileReader = new BufferedReader(new FileReader(args[0]));
             FileWriter fileWriter = new FileWriter(args[1])) {
            String line = "";
            while (fileReader.ready()) {
                line += fileReader.readLine() + " ";
            }
            Pattern p = Pattern.compile("(?<=\\s)[.[^ ]]{7,}(?=\\s)");
            Matcher m = p.matcher(line);

            int count = 0;
            while (m.find()) {
                if (count == 0) {
                    fileWriter.write(m.group());
                } else {
                    fileWriter.write("," + m.group());
                }
                count++;
                System.out.println(m.group());
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
