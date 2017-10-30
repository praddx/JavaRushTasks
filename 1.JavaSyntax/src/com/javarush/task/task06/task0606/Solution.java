package com.javarush.task.task06.task0606;

import java.io.*;

/* 
Чётные и нечётные циферки
*/

public class Solution {

    public static int even;
    public static int odd;

    public static void main(String[] args) throws IOException {
       BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

       String str = reader.readLine();
       int num;
       for (int i = 0; i < str.length(); i++) {
           num = Integer.parseInt(str.substring(i, i + 1));
           if (num % 2 == 0){
               even += 1;
           } else {
               odd += 1;
           }
       }
        System.out.println("Even: " + even + " Odd: " + odd);
    }
}
