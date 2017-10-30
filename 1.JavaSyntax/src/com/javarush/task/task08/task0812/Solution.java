package com.javarush.task.task08.task0812;

import java.io.*;
import java.util.ArrayList;

/* 
Cамая длинная последовательность
*/
public class Solution {
    public static void main(String[] args) throws IOException {
       BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
       ArrayList<Integer> intList = new ArrayList<>();
       int count = 1;
       int biggestCount = 0;

       for (int i = 0; i < 10; i++) {
           intList.add(Integer.parseInt(br.readLine()));
           if (i != 0 && intList.get(i) == intList.get(i - 1)) {
               count ++;
           }
           if (i != 0 && intList.get(i) != intList.get(i - 1)) {
               if (count > biggestCount) {
                   biggestCount = count;
               }
               count = 1;
           }
           if (i == 9) {
               if (count > biggestCount) {
                   biggestCount = count;
               }
           }
       }

       System.out.println(biggestCount);

    }
}