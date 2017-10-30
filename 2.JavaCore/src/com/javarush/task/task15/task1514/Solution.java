package com.javarush.task.task15.task1514;

import java.util.HashMap;
import java.util.Map;

/* 
Статики-1
*/

public class Solution {
    public static Map<Double, String> labels = new HashMap<Double, String>();

    static {
        labels.put(1.0, "bla");
        labels.put(2.0, "blabla");
        labels.put(3.0, "blablabla");
        labels.put(4.0, "blablablabla");
        labels.put(5.0, "blablablablabla");
    }

    public static void main(String[] args) {
        System.out.println(labels);
    }
}
