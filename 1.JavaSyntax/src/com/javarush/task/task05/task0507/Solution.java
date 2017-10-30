package com.javarush.task.task05.task0507;

/* 
Среднее арифметическое
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int number = 0;
        int count = 0;
        double sum = 0;
        while (number != -1) {
            number = Integer.parseInt(reader.readLine());
            if (number != -1) {
                sum += number;
                count++;
            }

        }
        System.out.println((double) sum / count);

    }
}

