package com.javarush.task.task30.task3010;

/* 
Минимальное допустимое основание системы счисления
*/

import java.math.BigDecimal;
import java.math.BigInteger;

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код

        try {

            BigInteger parsedNum = new BigInteger(args[0], 36);
            for (int i = 2; i <= 36; i++) {
                try {
                    parsedNum = new BigInteger(args[0], i);
                    System.out.println(i);
                    break;
                } catch (NumberFormatException e) {}
            }
        } catch (Exception e) {
            System.out.println("incorrect");
        }
    }
}