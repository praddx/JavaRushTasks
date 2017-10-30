package com.javarush.task.task05.task0504;


/* 
Трикотаж
*/

public class Solution {
    public static void main(String[] args) {
        Cat Vaska = new Cat("Vaska", 3, 5, 10);
        Cat Murzik = new Cat("Murzik", 2, 3, 8);
        Cat Rex = new Cat("Rex", 5, 8, 12);
    }

    public static class Cat {
        private String name;
        private int age;
        private int weight;
        private int strength;

        public Cat(String name, int age, int weight, int strength) {
            this.name = name;
            this.age = age;
            this.weight = weight;
            this.strength = strength;
        }
    }
}