package com.javarush.task.task07.task0705;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

/* 
Один большой массив и два маленьких
*/

public class Solution {
    public static void main(String[] args) throws Exception {
       BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
       int[] numArr = new int[20];
       int[] numArrCopy1 = new int[10];
       int[] numArrCopy2 = new int[10];

       for (int i = 0; i < numArr.length; i++) {
           numArr[i] = Integer.parseInt(br.readLine());
       }

       numArrCopy1 = Arrays.copyOfRange(numArr, 0, numArr.length / 2);
       numArrCopy2 = Arrays.copyOfRange(numArr, numArr.length / 2, numArr.length);

       for (int num : numArrCopy2) {
           System.out.println(num);
       }
    }
}
