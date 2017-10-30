package com.javarush.task.task18.task1821;

/* 
Встречаемость символов
*/

import javax.sound.midi.Soundbank;
import java.io.*;
import java.util.Map;
import java.util.TreeMap;
import java.util.TreeSet;

public class Solution {
    public static void main(String[] args) throws IOException {

        TreeMap<Integer, Integer> sortedFrequency = new TreeMap<>();

        InputStream fileReader = new FileInputStream(args[0]);
        Integer simbol;
        while (fileReader.available() > 0) {
            simbol = fileReader.read();
            if (sortedFrequency.containsKey(simbol)) {
                sortedFrequency.replace(simbol, sortedFrequency.get(simbol) + 1);
            } else {
                sortedFrequency.put(simbol, 1);
            }
        }

        fileReader.close();

        for (Map.Entry<Integer, Integer> element : sortedFrequency.entrySet()) {
            System.out.printf("%c %d", (char) element.getKey().intValue(), element.getValue());
            System.out.println();
        }
    }
}
