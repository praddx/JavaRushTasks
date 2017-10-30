package com.javarush.task.task09.task0927;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* 
Десять котов
*/

public class Solution {
    public static void main(String[] args) {
        Map<String, Cat> map = createMap();
        Set<Cat> set = convertMapToSet(map);
        printCatSet(set);
    }

    public static Map<String, Cat> createMap() {
        HashMap<String, Cat> catMap = new HashMap<>();
        catMap.put("Vaska", new Cat("Vaska"));
        catMap.put("Murzik", new Cat("Murzik"));
        catMap.put("Barsik", new Cat("Barsik"));
        catMap.put("Kis", new Cat("Kis"));
        catMap.put("Rex", new Cat("Rex"));
        catMap.put("Tom", new Cat("Tom"));
        catMap.put("Kitty", new Cat("Kitty"));
        catMap.put("Zen", new Cat("Zen"));
        catMap.put("Dim", new Cat("Dim"));
        catMap.put("Bom", new Cat("Bom"));

        return catMap;
    }

    public static Set<Cat> convertMapToSet(Map<String, Cat> map) {

        return new HashSet<>(map.values());
    }

    public static void printCatSet(Set<Cat> set) {
        for (Cat cat : set) {
            System.out.println(cat);
        }
    }

    public static class Cat {
        private String name;

        public Cat(String name) {
            this.name = name;
        }

        public String toString() {
            return "Cat " + this.name;
        }
    }


}
