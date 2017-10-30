package com.javarush.task.task04.task0416;

/* 
Переходим дорогу вслепую
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        double t = Double.parseDouble(bufferedReader.readLine());
        double minutes = t % 5;
        if(minutes >= 0.0 && minutes < 3.0) {
            System.out.println("зелёный");
        } else if(minutes >= 3.0 && minutes < 4.0) {
            System.out.println("желтый");
        } else {
            System.out.println("красный");
        }
    }
}