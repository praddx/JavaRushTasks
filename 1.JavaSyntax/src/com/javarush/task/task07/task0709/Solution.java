package com.javarush.task.task07.task0709;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Выражаемся покороче
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> list = new ArrayList<>();
        int min = 0;
        for (int i = 0; i < 5; i++) {
            list.add(br.readLine());
            if (i == 0) {min = list.get(i).length();}
            if (list.get(i).length() < min) {
                min = list.get(i).length();
            }
        }

        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).length() == min) {
                System.out.println(list.get(i));
            }
        }
    }
}
