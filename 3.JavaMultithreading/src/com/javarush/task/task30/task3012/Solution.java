package com.javarush.task.task30.task3012;

/* 
Получи заданное число
*/

public class Solution {
    private static int count = 0;

    public static void main(String[] args) {
        Solution solution = new Solution();
        solution.createExpression(74);
    }

    public void createExpression(int number) {
        //int result = number;
        int a = number;
        int b;
        int count = 0;

        System.out.print(number + " =");
        while (number > 2) {
             a = number / 3;
             b = number % 3;
                if (b == 1) {
                    System.out.print(" + " + (int)Math.pow(3, count));
                } else if (b == 2) {
                    System.out.print(" - " + (int)Math.pow(3, count));
                    a++;
                }
                if (a == 1) {
                    System.out.print(" + " + (int)Math.pow(3, ++count));
                } else if (a == 2) {
                    System.out.print(" - " + (int)Math.pow(3, ++count));
                    System.out.print(" + " + (int)Math.pow(3, ++count));
                    //a++;
                }
                count++;
                number = a;
        }
    }
}