package com.javarush.task.task07.task0717;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Удваиваем слова
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader br  = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> list = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            list.add(br.readLine());
        }


        ArrayList<String> result = doubleValues(list);

        for (String str : result) {
            System.out.println(str);
        }
    }

    public static ArrayList<String> doubleValues(ArrayList<String> list) {
        for (int i = list.size(); i > 0; i--){
            list.add(i, list.get(i-1));
        }
        return list;
    }
}
