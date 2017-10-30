package com.javarush.task.task25.task2511;

import java.util.TimerTask;

/* 
Вооружаемся до зубов!
*/
public class Solution extends TimerTask {
    protected TimerTask original;
    protected final Thread.UncaughtExceptionHandler handler;

    public Solution(TimerTask original) {
        if (original == null) {
            throw new NullPointerException();
        }
        this.original = original;
        this.handler = new Thread.UncaughtExceptionHandler() {
            @Override
            public void uncaughtException(Thread t, Throwable e) {
              String threadName = t.getName().replaceAll(".", "*");
              //String message = e.getMessage();


              //Thread.currentThread().setName(threadName.replaceAll(".", "*"));
              System.out.println(e.getMessage().replaceAll(t.getName(), threadName));
            }
        };    //init handler here

    }

    public void run() {
        try {
            original.run();
            throw new Exception();
        } catch (Throwable cause) {
            Thread currentThread = Thread.currentThread();
            handler.uncaughtException(currentThread, new Exception("Blah " + currentThread.getName()/*.replaceAll(".", "*")*/ + " blah-blah-blah", cause));
        }
    }

    public long scheduledExecutionTime() {
        return original.scheduledExecutionTime();
    }

    public boolean cancel() {
        return original.cancel();
    }

    public static void main(String[] args) {
        /*String s = "laskdjf";
        System.out.println(s.replaceAll(".", "*"));*/
        Solution sol = new Solution(new TimerTask() {
            @Override
            public void run() {
                System.out.println("timer");
            }
        });

        sol.run();
    }
}