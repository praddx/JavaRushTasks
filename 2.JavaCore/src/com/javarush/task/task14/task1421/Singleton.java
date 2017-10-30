package com.javarush.task.task14.task1421;

/**
 * Created by Pradd on 07.09.2017.
 */
public class Singleton {

    private static final Singleton instance = new Singleton();

    private Singleton() {

    }

    public static Singleton getInstance() {
        return instance;
    }
}
