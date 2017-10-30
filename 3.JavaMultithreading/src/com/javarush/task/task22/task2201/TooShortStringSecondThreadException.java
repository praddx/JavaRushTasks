package com.javarush.task.task22.task2201;

/*import com.javarush.task.task22.task2203.*;
import com.javarush.task.task22.task2203.Solution;*/

public class TooShortStringSecondThreadException extends RuntimeException {

    public TooShortStringSecondThreadException(Throwable e) {
        super(e);
    }
}
