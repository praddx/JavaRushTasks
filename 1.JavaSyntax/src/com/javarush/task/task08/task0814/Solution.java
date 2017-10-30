package com.javarush.task.task08.task0814;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* 
Больше 10? Вы нам не подходите
*/

public class Solution {
    public static HashSet<Integer> createSet() {
        HashSet<Integer> intSet = new HashSet<>();
        for (int i = 0; i < 20; i++) {
            intSet.add(i);
        }
        return intSet;
    }

    public static HashSet<Integer> removeAllNumbersMoreThan10(HashSet<Integer> set) {
        Iterator it = set.iterator();
        Integer num;
        while (it.hasNext()) {
            num = (Integer) it.next();
            if (num > 10) {
                it.remove();
            }
        }

        return set;

    }

    public static void main(String[] args) {

    }
}
