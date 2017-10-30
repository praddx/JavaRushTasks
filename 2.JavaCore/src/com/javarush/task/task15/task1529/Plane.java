package com.javarush.task.task15.task1529;

/**
 * Created by Pradd on 09.09.2017.
 */
public class Plane implements Flyable {

    public int passengersCapacity;

    public Plane (int passengersCapacity) {
        this.passengersCapacity = passengersCapacity;
    }

    @Override
    public void fly() {

    }
}
