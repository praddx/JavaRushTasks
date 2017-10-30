package com.javarush.task.task04.task0420;

/* 
Сортировка трех чисел
*/

import java.io.*;
import java.util.Arrays;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));


        int n1 = Integer.parseInt(bufferedReader.readLine());
        int n2 = Integer.parseInt(bufferedReader.readLine());
        int n3 = Integer.parseInt(bufferedReader.readLine());

        int max = Math.max(n1, Math.max(n2, n3));
        int min = Math.min(n1, Math.min(n2, n3));
        int mid = n1 + n2 + n3 - max - min;

        System.out.println(max + " " + mid + " " + min);

    }
}
