package com.javarush.task.task08.task0823;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Омовение Рамы
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = reader.readLine();
        String newS = "";
        for (int i = 0; i < s.length(); i++) {
            if (i == 0 || s.substring(i - 1, i).equals(" ")) {
                newS = newS + s.substring(i, i + 1).toUpperCase();
            } else {
                newS += s.substring(i, i + 1);
            }



        }
        System.out.println(newS);
    }
}
