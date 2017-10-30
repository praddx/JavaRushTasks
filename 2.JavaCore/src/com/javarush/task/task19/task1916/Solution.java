package com.javarush.task.task19.task1916;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* 
Отслеживаем изменения
*/

public class Solution {
    public static List<LineItem> lines = new ArrayList<LineItem>();

    public static void main(String[] args) {
        try (BufferedReader consoleReader = new BufferedReader(new InputStreamReader(System.in));
            BufferedReader firstFileReader = new BufferedReader(new FileReader(consoleReader.readLine()));
            BufferedReader secondFileReader = new BufferedReader(new FileReader(consoleReader.readLine()))) {

            List<String> firstFileContents = new ArrayList<>();
            List<String> secondFileContents = new ArrayList<>();

            while (firstFileReader.ready()) {
                firstFileContents.add(firstFileReader.readLine());
            }

            while (secondFileReader.ready()) {
                secondFileContents.add(secondFileReader.readLine());
            }

            while (firstFileContents.size() > 0) {
                if (firstFileContents.get(0).equals(secondFileContents.get(0))) {
                    lines.add(new LineItem(Type.SAME, firstFileContents.get(0)));
                    firstFileContents.remove(0);
                    secondFileContents.remove(0);
                } else if (firstFileContents.get(1).equals(secondFileContents.get(0))) {
                    lines.add(new LineItem(Type.REMOVED, firstFileContents.get(0)));
                    firstFileContents.remove(0);
                } else if (firstFileContents.get(0).equals(secondFileContents.get(1))) {
                    lines.add(new LineItem(Type.ADDED, secondFileContents.get(0)));
                    secondFileContents.remove(0);
                }
            }

            if (secondFileContents.size() > 0) {
                lines.add(new LineItem(Type.ADDED, secondFileContents.get(0)));
            }

            for (LineItem line : lines) {
                System.out.println(line.line + "   " + line.type);
            }





        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    public static enum Type {
        ADDED,        //добавлена новая строка
        REMOVED,      //удалена строка
        SAME          //без изменений
    }

    public static class LineItem {
        public Type type;
        public String line;

        public LineItem(Type type, String line) {
            this.type = type;
            this.line = line;
        }
    }
}
