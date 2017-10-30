package com.javarush.task.task26.task2611;

import java.util.concurrent.ConcurrentHashMap;

/**
 * Created by Pradd on 24.10.2017.
 */
public class Producer implements Runnable {

    private ConcurrentHashMap<String, String> map = new ConcurrentHashMap<>();

    public Producer (ConcurrentHashMap<String, String> map) {
        this.map = map;
    }

    public void run() {
        int i = 1;
        while (!Thread.interrupted()) {
            map.put(String.valueOf(i), "Some text for " + i);
            i++;
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                System.out.println(Thread.currentThread().getName() + " thread was terminated");
            }
        }
    }
}
