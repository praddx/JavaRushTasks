package com.javarush.task.task09.task0921;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* 
Метод в try..catch
*/

public class Solution {
    public static void main(String[] args) {
        readData();
    }

    public static void readData() {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        //String totalString = "";
        ArrayList<Integer> list = new ArrayList<>();
        int num;
        try {
           while (true) {
               num = Integer.parseInt(br.readLine());
               list.add(num);
           }
        } catch(NumberFormatException e) {
            for (int enteredNum : list) {
                System.out.println(enteredNum);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
