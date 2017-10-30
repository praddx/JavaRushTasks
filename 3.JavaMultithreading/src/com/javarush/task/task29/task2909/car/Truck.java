package com.javarush.task.task29.task2909.car;

/**
 * Created by Pradd on 18.10.2017.
 */
public class Truck extends Car {

    public static final int MAX_TRUCK_SPEED = 80;

    public Truck (int numberOfPassengers) {
        super(TRUCK, numberOfPassengers);

    }

    @Override
    public int getMaxSpeed() {

        return MAX_TRUCK_SPEED;
    }
}
