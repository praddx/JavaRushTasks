package com.javarush.task.task15.task1516;

/* 
Значения по умолчанию
*/

public class Solution {

    public int intVar;
    public double doubleVar;
    public Double DoubleVar;
    public boolean booleanVar;
    public Object ObjectVar;
    public Exception ExceptionVar;
    public String StringVar;

    public static void main(String[] args) {
        Solution solutionObject = new Solution();
        System.out.println(solutionObject.intVar);
        System.out.println(solutionObject.doubleVar);
        System.out.println(solutionObject.DoubleVar);
        System.out.println(solutionObject.booleanVar);
        System.out.println(solutionObject.ObjectVar);
        System.out.println(solutionObject.ExceptionVar);
        System.out.println(solutionObject.StringVar);
    }
}
