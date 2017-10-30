package com.javarush.task.task07.task0707;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Что за список такой?
*/

public class Solution {
    public static void main(String[] args) throws Exception {

        ArrayList<String> list = new ArrayList();

        list.add("bla");
        list.add("bla bla");
        list.add("bla bla bla");
        list.add("blabla");
        list.add("blablabla");

        System.out.println(list.size());
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
}
