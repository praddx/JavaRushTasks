package com.javarush.task.task07.task0715;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Продолжаем мыть раму
*/

public class Solution {
    public static void main(String[] args) throws Exception {
       ArrayList<String> list = new ArrayList<>();
       list.add("мама");
       list.add("мыла");
       list.add("раму");

       for (int i = list.size(); i > 0; i--){
           list.add(i, "именно");
       }

       for (String str : list) {
           System.out.println(str);
       }
    }
}
