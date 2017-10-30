package com.javarush.task.task19.task1924;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

/* 
Замена чисел
*/

public class Solution {
    public static Map<Integer, String> map = new HashMap<Integer, String>();

    static {
        map.put(0, "ноль");
        map.put(1, "один");
        map.put(2, "два");
        map.put(3, "три");
        map.put(4, "четыре");
        map.put(5, "пять");
        map.put(6, "шесть");
        map.put(7, "семь");
        map.put(8, "восемь");
        map.put(9, "девять");
        map.put(10, "десять");
        map.put(11, "одиннадцать");
        map.put(12, "двенадцать");

    }

    public static void main(String[] args) {
        try (BufferedReader consoleReader = new BufferedReader(new InputStreamReader(System.in));
            BufferedReader fileReader = new BufferedReader(new FileReader(consoleReader.readLine()))) {
            String line = "";
            while (fileReader.ready()) {
                line = fileReader.readLine();
                //String[] splittedLine = line.split(" ");
                /*for (Map.Entry<Integer, String> el : map.entrySet()) {

                    line = line.replaceAll(" " + el.getKey().toString() + " ", " " + el.getValue() + " ");
                }*/
                for (int i = 0; i < 13; i++) {

                    line = line.replaceAll("\\b" + Integer.toString(i) + "\\b", map.get(i));
                }
                System.out.println(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
