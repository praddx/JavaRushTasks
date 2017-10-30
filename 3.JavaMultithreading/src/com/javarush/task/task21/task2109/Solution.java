package com.javarush.task.task21.task2109;

/* 
Запретить клонирование
*/
public class Solution {
    public static class A implements Cloneable {
        private int i;
        private int j;

        public A(int i, int j) {
            this.i = i;
            this.j = j;
        }

        public int getI() {
            return i;
        }

        public int getJ() {
            return j;
        }

        public A clone() throws CloneNotSupportedException {
            A clonedA = null;

                clonedA = (A) super.clone();

            return clonedA;
        }
    }

    public static class B extends A {
        private String name;

        public B(int i, int j, String name) {
            super(i, j);
            this.name = name;
        }

        public String getName() {
            return name;
        }

        public B clone() throws CloneNotSupportedException {


            throw new CloneNotSupportedException();

        }
    }

    public static class C extends B implements Cloneable{
        public C(int i, int j, String name) {
            super(i, j, name);
        }

        public C clone() {
            C clonedC = null;
            try {
                clonedC = (C) super.clone();
            } catch (CloneNotSupportedException e) {
                e.printStackTrace();
            }

            return clonedC;
        }
    }

    public static void main(String[] args) {

    }
}
