package com.javarush.task.task08.task0815;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Collection;
import java.util.Set;

/* 
Перепись населения
*/

public class Solution {
    public static HashMap<String, String> createMap() {
        HashMap<String, String> nameMap = new HashMap<>();
        nameMap.put("Плахотин", "Александр");
        nameMap.put("Прыгунков", "Александр");
        nameMap.put("Ашухин", "Дмитрий");
        nameMap.put("Михайлов", "Борис");
        nameMap.put("Тарасов", "Дмитрий");
        nameMap.put("Прыгункова", "Наталья");
        nameMap.put("Болтинский", "Дмитрий");
        nameMap.put("Прыгунковаc", "Аня");
        nameMap.put("Максимов", "Максим");
        nameMap.put("Ерохин", "Андрей");

        return nameMap;
    }

    public static int getCountTheSameFirstName(HashMap<String, String> map, String name) {
        Collection<String> firstName = map.values();
        int count = 0;
        for (String fName : firstName) {
            if (fName.equals(name)) {
                count++;
            }
        }
        return count;
    }

    public static int getCountTheSameLastName(HashMap<String, String> map, String lastName) {
        Set<String> lName = map.keySet();
        int count = 0;
        for (String surname : lName) {
            if (surname.equals(lastName)) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {

    }
}
