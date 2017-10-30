package com.javarush.task.task07.task0713;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* 
Играем в Jолушку
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<Integer> listDivBy3 = new ArrayList<>();
        ArrayList<Integer> listDivBy2 = new ArrayList<>();
        ArrayList<Integer> listOthers = new ArrayList<>();
        int num;

        for (int i = 0; i < 20; i++) {
            num = Integer.parseInt(br.readLine());
            list.add(num);
            if (num % 2 == 0) {
                listDivBy2.add(num);
            }
            if (num % 3 == 0) {
                listDivBy3.add(num);
            }
            if (num % 2 != 0 && num % 3 != 0) {
                listOthers.add(num);
            }
        }

        printList(listDivBy3);
        printList(listDivBy2);
        printList(listOthers);
    }

    public static void printList(List<Integer> list) {

        for (int num : list) {
            System.out.println(num);
        }
    }
}
