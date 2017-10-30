package com.javarush.task.task08.task0821;

import java.util.HashMap;
import java.util.Map;

/* 
Однофамильцы и тёзки
*/

public class Solution {
    public static void main(String[] args) {
        Map<String, String> map = createPeopleList();
        printPeopleList(map);
    }

    public static Map<String, String> createPeopleList() {

        Map<String, String> people = new HashMap<>();

        people.put("asdklgj", "asdfg");
        people.put("xzcv", "ewqr");
        people.put("assj", "asdfg");
        people.put("awer", "asdfg");
        people.put("xzcv", "qwer");
        people.put("kljl", "wer");
        people.put("xzcv", "asdfgyuio");
        people.put("asdkljlkgj", "qwe");
        people.put("asdklgoiweqrj", "aasdfxcvg");
        people.put("zxcvswq", "poj");

        return people;
    }

    public static void printPeopleList(Map<String, String> map) {
        for (Map.Entry<String, String> s : map.entrySet()) {
            System.out.println(s.getKey() + " " + s.getValue());
        }
    }
}
