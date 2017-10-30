package com.javarush.task.task22.task2202;

import java.util.ArrayList;
import java.util.List;

/*
Найти подстроку
*/
public class Solution {
    public static void main(String[] args) {
        try {
            System.out.println(getPartOfString("JavaRush - лучший сервис обучения Java."));
        } catch (RuntimeException e) {}
    }

    public static String getPartOfString(String string) {

        if (string == null) {
            throw  new TooShortStringException();
        }

        String[] splitted = string.split(" ");

        if (splitted.length < 5 || string == null) {
            throw new TooShortStringException();
        }

        return splitted[1] + " " + splitted[2] + " " + splitted[3] + " " + splitted[4];


        /*List<Integer> indexes = new ArrayList<>();
        char[] chars = string.toCharArray();

        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == ' ') {
                indexes.add(i);
            }
        }

        if (indexes.size() < 4) {
            throw new TooShortStringException();
        }

        return string.substring(indexes.get(0) + 1, indexes.get(4));*/
        
    }

    public static class TooShortStringException extends RuntimeException {
    }
}
