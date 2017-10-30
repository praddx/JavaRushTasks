package com.javarush.task.task04.task0412;

/* 
Положительное и отрицательное число
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
       BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

       String number = bufferedReader.readLine();
       int num = Integer.parseInt(number);

       if (num < 0) {
           System.out.println(num + 1);
       } else if (num == 0) {
           System.out.println("0");
       } else {
           System.out.println(num * 2);
       }

    }

}