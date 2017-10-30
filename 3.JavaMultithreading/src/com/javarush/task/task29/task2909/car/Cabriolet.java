package com.javarush.task.task29.task2909.car;

/**
 * Created by Pradd on 18.10.2017.
 */
public class Cabriolet extends Car {

    public static final int MAX_CABRIOLET_SPEED = 90;

    public Cabriolet (int numberOfPassengers) {
        super(CABRIOLET, numberOfPassengers);

    }

    @Override
    public int getMaxSpeed() {
        //int MAX_CABRIOLET_SPEED = 90;
        return MAX_CABRIOLET_SPEED;
    }
}
