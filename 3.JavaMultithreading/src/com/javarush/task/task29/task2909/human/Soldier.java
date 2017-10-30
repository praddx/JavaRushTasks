package com.javarush.task.task29.task2909.human;

/**
 * Created by Pradd on 18.10.2017.
 */
public class Soldier extends Human {

    private int bloodGroup;

    public Soldier(String name, int age) {
        super(name, age);
    }

    public void printSize() {
        System.out.println("Рост: " + size.height + " Вес: " + size.weight);
    }

    public void fight() {
    }

    public void live() {

            fight();
    }
}
