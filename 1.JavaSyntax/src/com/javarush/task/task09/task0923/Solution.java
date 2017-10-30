package com.javarush.task.task09.task0923;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Гласные и согласные
*/

public class Solution {
    public static char[] vowels = new char[]{'а', 'я', 'у', 'ю', 'и', 'ы', 'э', 'е', 'о', 'ё'};

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        String vowelString = "";
        String notVowelString = "";
        for (int i = 0; i < str.length(); i++) {
            if (isVowel(str.charAt(i))) {
                vowelString += (str.substring(i, i + 1) + " ");
            } else if (str.charAt(i) == ' ') {}
            else {
                notVowelString += (str.substring(i, i + 1) + " ");
            }
        }
        System.out.println(vowelString);
        System.out.println(notVowelString);
    }

    // метод проверяет, гласная ли буква
    public static boolean isVowel(char c) {
        c = Character.toLowerCase(c);  // приводим символ в нижний регистр - от заглавных к строчным буквам

        for (char d : vowels)   // ищем среди массива гласных
        {
            if (c == d)
                return true;
        }
        return false;
    }
}