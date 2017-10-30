package com.javarush.task.task14.task1420;

/* 
НОД
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            try {
                int firstNumber = Integer.parseInt(reader.readLine());
                int secondNumber = Integer.parseInt(reader.readLine());
                if (firstNumber <= 0 || secondNumber <= 0) {
                    throw new Exception();
                }


        while (secondNumber !=0) {
            int tmp = firstNumber % secondNumber;
            firstNumber = secondNumber;
            secondNumber = tmp;
        }

        System.out.println(firstNumber);
            } catch (NumberFormatException e) {
                throw new Exception();
            }

         //catch (Exception e) {}

    }
}
