package com.javarush.task.task19.task1920;

/* 
Самый богатый
*/

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Map;
import java.util.SortedMap;
import java.util.TreeMap;

public class Solution {
    public static void main(String[] args) {
        SortedMap<String, Double> salaries = new TreeMap<>();

        try (BufferedReader fileReader = new BufferedReader(new FileReader(args[0]))) {
            String line = "";
            double maxSalary= 0;
            while ((line = fileReader.readLine()) != null) {
                //System.out.println(line);
                String[] entry = line.split(" ");
                if (salaries.containsKey(entry[0])) {
                    salaries.replace(entry[0], salaries.get(entry[0]) + Double.parseDouble(entry[1]));

                } else {
                    salaries.put(entry[0], Double.parseDouble(entry[1]));
                }
                maxSalary = Math.max(maxSalary, salaries.get(entry[0]));
            }
            for (Map.Entry<String, Double> salary : salaries.entrySet()) {
                if (salary.getValue() == maxSalary)
                    System.out.println(salary.getKey());
            }
        } catch (FileNotFoundException e1) {
            e1.printStackTrace();
        } catch (IOException e1) {
            e1.printStackTrace();
        }

            //System.out.println("Привет");

    }
}
