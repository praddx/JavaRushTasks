package com.javarush.task.task08.task0816;

import java.util.Date;
import java.util.HashMap;

/* 
Добрая Зинаида и летние каникулы
*/

public class Solution {
    public static HashMap<String, Date> createMap() {
        HashMap<String, Date> map = new HashMap<String, Date>();
        map.put("Stallone", new Date("JUNE 1 1980"));
        map.put("Chak", new Date("JUNE 1 1980"));
        map.put("Bruce", new Date("DECEMBER 15 1985"));
        map.put("Matt", new Date("MARCH 7 1999"));
        map.put("John", new Date("JULY 1 1973"));
        map.put("Stanley", new Date("APRIL 5 1983"));
        map.put("Baby", new Date("OCTOBER 3 2001"));
        map.put("Jaina", new Date("JUNE 5 1980"));
        map.put("Lucy", new Date("JUNE 6 1980"));
        map.put("Lilu", new Date("JUNE 2 1980"));

        return map;
    }

    public static void removeAllSummerPeople(HashMap<String, Date> map) {
        //напишите тут ваш код

    }

    public static void main(String[] args) {

    }
}
