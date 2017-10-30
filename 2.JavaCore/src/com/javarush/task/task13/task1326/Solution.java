package com.javarush.task.task13.task1326;

/* 
Сортировка четных чисел из файла
*/

import java.io.*;
import java.util.ArrayList;
import java.util.Set;
import java.util.TreeSet;
import java.util.List;

public class Solution {
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Set<Integer> evenNumbersFromFile = new TreeSet<>();
        String line = "";
        List<Integer> numberList = new ArrayList<>();
        int number = 0;
        try {
            InputStream fileReader = new FileInputStream(br.readLine());
            br.close();
            char simbol;
            while (fileReader.available() > 0) {
                simbol = (char) fileReader.read();
                if (simbol != '\r' && simbol != '\n') {
                    line += simbol;
                } else if (simbol != '\r') {
                    /*if ((number = Integer.parseInt(line)) % 2 == 0) {
                        evenNumbersFromFile.add(number);
                    }*/
                    System.out.println(line);
                    line = "";
                }

            }

        fileReader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }


        for (int num : evenNumbersFromFile) {
            System.out.println(num);
        }
    }
}
