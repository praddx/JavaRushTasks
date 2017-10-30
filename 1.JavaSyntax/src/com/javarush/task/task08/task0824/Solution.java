package com.javarush.task.task08.task0824;

/* 
Собираем семейство
*/

import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) {
        Human sasha = new Human("Sasha", true, 32);
        Human natasha = new Human("Natasha", false, 30);
        Human dima = new Human("Dima", true, 25);
        ArrayList<Human> grandChildren = new ArrayList<>();
        grandChildren.add(sasha);
        grandChildren.add(natasha);
        grandChildren.add(dima);
        Human sergey = new Human("Sergey", true, 61, grandChildren);
        Human tanya = new Human("Tanya", false, 63, grandChildren);
        ArrayList<Human> children1 = new ArrayList<>();
        children1.add(sergey);
        ArrayList<Human> children2 = new ArrayList<>();
        children2.add(tanya);
        Human ivan = new Human("Ivan", true, 82, children2);
        Human olga = new Human("Olga", false, 85, children2);
        Human pavel = new Human("Pavel", true, 83, children1);
        Human galina = new Human("Galina", false, 79, children1);
        ArrayList<Human> people = new ArrayList<>();
        people.add(sasha);
        people.add(natasha);
        people.add(dima);
        people.add(sergey);
        people.add(tanya);
        people.add(ivan);
        people.add(olga);
        people.add(pavel);
        people.add(galina);

        for (Human human : people) {
            System.out.println(human.toString());
        }
    }

    public static class Human {
        String name;
        boolean sex;
        int age;
        ArrayList<Human> children;

        public Human (String name, boolean sex, int age, ArrayList<Human> children) {
            this.name = name;
            this.sex = sex;
            this.age = age;
            this.children = children;
        }

        public Human (String name, boolean sex, int age) {
            this.name = name;
            this.sex = sex;
            this.age = age;
            this.children = new ArrayList<>();
        }

        public String toString() {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            int childCount = this.children.size();
            if (childCount > 0) {
                text += ", дети: " + this.children.get(0).name;

                for (int i = 1; i < childCount; i++) {
                    Human child = this.children.get(i);
                    text += ", " + child.name;
                }
            }
            return text;
        }
    }

}
