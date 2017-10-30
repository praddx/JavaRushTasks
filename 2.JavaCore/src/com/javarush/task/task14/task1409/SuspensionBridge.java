package com.javarush.task.task14.task1409;

/**
 * Created by Pradd on 05.09.2017.
 */
public class SuspensionBridge implements Bridge {
    private static final int carsCount = 68;
    @Override
    public int getCarsCount() {
        return this.carsCount;
    }
}
