package com.javarush.task.task10.task1011;

/* 
Большая зарплата
*/

public class Solution {
    public static void main(String[] args) {
        String s = "Я не хочу изучать Java, я хочу большую зарплату";
        int count = 0;
        for (int i = 0; count < 40; i++) {
            /*if (s.charAt(i) != ' ') {
                s = s.substring(i, s.length());
            } else {
                s = s.substring(i + 1, )
            }*/

            if (i % 2 != 0) {
                if (s.charAt(i) != ' ') {
                    System.out.println(s.substring(i, s.length()));
                    System.out.println(s.substring(i, s.length()));
                    count+= 2;
                } else {
                    System.out.println(s.substring(i+1, s.length()));
                    System.out.println(s.substring(i+1, s.length()));
                    i++;
                    count += 2;
                }
            } else {
                if (s.charAt(i) != ' ') {
                    System.out.println(s.substring(i, s.length()));
                    count++;
                } else {
                    System.out.println(s.substring(i + 1, s.length()));
                    i++;
                    count++;
                }
            }

        }
    }

}

