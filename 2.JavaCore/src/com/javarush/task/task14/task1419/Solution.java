package com.javarush.task.task14.task1419;

import javax.xml.bind.ValidationException;
import java.lang.invoke.WrongMethodTypeException;
import java.util.ArrayList;
import java.util.List;

/* 
Нашествие исключений
*/

public class Solution {
    public static List<Exception> exceptions = new ArrayList<Exception>();

    public static void main(String[] args) {
        initExceptions();

        for (Exception exception : exceptions) {
            System.out.println(exception);
        }
    }

    private static void initExceptions() {   //it's first exception
        try {
            float i = 1 / 0;

        } catch (Exception e) {
            exceptions.add(e);
            exceptions.add(new NullPointerException());
            exceptions.add(new ArithmeticException());
            exceptions.add(new ArrayStoreException());
            exceptions.add(new NumberFormatException());
            exceptions.add(new NegativeArraySizeException());
            exceptions.add(new RuntimeException());
            exceptions.add(new WrongMethodTypeException());
            exceptions.add(new ClassCastException());
            exceptions.add(new ClassNotFoundException());
        }

        /*try {
            int i = 1 / 0;
        } catch (ArithmeticException e) {
            exceptions.add(e);
        }*/

    }
}
