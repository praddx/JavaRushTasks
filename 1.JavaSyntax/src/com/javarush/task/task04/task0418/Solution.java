package com.javarush.task.task04.task0418;

/* 
Минимум двух чисел
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n1 = Integer.parseInt(bufferedReader.readLine());
        int n2 = Integer.parseInt(bufferedReader.readLine());

        System.out.println(Math.min(n1,n2));
    }
}