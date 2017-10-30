package com.javarush.task.task22.task2203;

import java.util.ArrayList;
import java.util.List;

/*
Между табуляциями
*/
public class Solution {
    public static String getPartOfString(String string) throws TooShortStringException {

        if (string == null) {
            throw new TooShortStringException();
        }

        List<Integer> indexes = new ArrayList<>();
        char[] chars = string.toCharArray();

        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == '\t') {
                indexes.add(i);
            }
        }

        if (indexes.size() < 2) {
            throw new TooShortStringException();
        }

        return string.substring(indexes.get(0) + 1, indexes.get(1));

    }

    public static class TooShortStringException extends Exception {
    }

    public static void main(String[] args) throws TooShortStringException {
        System.out.println(getPartOfString("\tJavaRush - лучший сервис \tобучения Java\t."));
    }
}
