package com.javarush.task.task04.task0419;

/* 
Максимум четырех чисел
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n1 = Integer.parseInt(bufferedReader.readLine());
        int n2 = Integer.parseInt(bufferedReader.readLine());
        int n3 = Integer.parseInt(bufferedReader.readLine());
        int n4 = Integer.parseInt(bufferedReader.readLine());

        int max;
        max = Math.max(n1, n2);
        max = Math.max(max, n3);
        max = Math.max(max, n4);

        System.out.println(max);
    }
}
