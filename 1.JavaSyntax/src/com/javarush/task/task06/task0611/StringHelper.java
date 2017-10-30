package com.javarush.task.task06.task0611;


/* 
Класс StringHelper
*/

public class StringHelper {
    public static String multiply(String s) {
        String result = "";
        result = s + s + s + s + s;
        return result;
    }

    public static String multiply(String s, int count) {
        String result = "";
        //String = s;
        for (int i = 0; i < count; i++) {
            result += s;
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(StringHelper.multiply("abc", 3));

    }
}
