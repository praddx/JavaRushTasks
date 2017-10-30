package com.javarush.task.task08.task0813;

import java.util.HashSet;

/* 
20 слов на букву «Л»
*/

public class Solution {
    public static HashSet<String> createSet() {
        HashSet<String> strSet = new HashSet<>();

        for (int i = 0; i < 20; i++) {
            strSet.add("Леприкон" + i);
        }
        return strSet;
    }

    public static void main(String[] args) {

    }
}
