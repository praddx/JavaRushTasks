package com.javarush.task.task09.task0926;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

/* 
Список из массивов чисел
*/

public class Solution {
    public static void main(String[] args) {
        ArrayList<int[]> list = createList();
        printList(list);
    }

    public static ArrayList<int[]> createList() {
        ArrayList<int[]> arrayList = new ArrayList<>();
        arrayList.add(new int[] {3, 5, 1, 8, 3});
        arrayList.add(new int[] {1, 8});
        arrayList.add(new int[] {3, 4, 2, 9});
        arrayList.add(new int[] {3, 5, 1, 9 ,14, 43, 6});
        arrayList.add(new int[] {});

        for (int i = 0; i < arrayList.size(); i++) {
            Arrays.fill(arrayList.get(i), i);
        }

        return arrayList;
    }

    public static void printList(ArrayList<int[]> list) {
        for (int[] array : list) {
            for (int x : array) {
                System.out.println(x);
            }
        }
    }
}
