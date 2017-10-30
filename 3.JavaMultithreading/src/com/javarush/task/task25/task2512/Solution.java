package com.javarush.task.task25.task2512;

import java.util.ArrayList;
import java.util.List;

/*
Живем своим умом
*/
public class Solution implements Thread.UncaughtExceptionHandler {

    @Override
    public void uncaughtException(Thread t, Throwable e) {
        List<String> exceptions = new ArrayList<>();
        t.interrupt();
        Throwable ex = e;
        while (ex != null) {
            exceptions.add(ex.getClass().getName() + ": " + ex.getMessage());
            ex = ex.getCause();
        }
        for (int i = exceptions.size() - 1; i >= 0; i--) {
            System.out.println(exceptions.get(i));
        }
    }

    public static void main(String[] args) {
    }
}
