package com.javarush.task.task07.task0703;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Общение одиноких массивов
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] strArr = new String[10];
        int[] lengthArr = new int[10];

        for (int i = 0; i < strArr.length; i++) {
            strArr[i] = br.readLine();
            lengthArr[i] = strArr[i].length();
        }

        for (int length : lengthArr) {
            System.out.println(length);
        }
    }
}
