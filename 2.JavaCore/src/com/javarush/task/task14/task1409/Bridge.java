package com.javarush.task.task14.task1409;

/**
 * Created by Pradd on 05.09.2017.
 */
public interface Bridge {
    default int getCarsCount() {
        return 0;
    }
}
