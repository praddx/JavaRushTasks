package com.javarush.task.task19.task1921;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/* 
Хуан Хуанович
*/

public class Solution {
    public static final List<Person> PEOPLE = new ArrayList<Person>();

    public static void main(String[] args) {

        try (BufferedReader fileReader = new BufferedReader(new FileReader(args[0]))) {

            //String line;
            while ((fileReader.ready())) {
                //System.out.println(line);

                String[] entry = fileReader.readLine().split(" ");

                String name = "";
                for (int i = 0; i < entry.length - 3; i++) {
                    name += entry[i];
                    if (i != entry.length - 4) {
                        name += " ";
                    }
                }
                //System.err.println(entry.length);
                PEOPLE.add(new Person(name, new Date(Integer.parseInt(entry[entry.length - 1]) - 1900,
                        Integer.parseInt(entry[entry.length - 2]) - 1, Integer.parseInt(entry[entry.length - 3]))));
            }


            for (Person person : PEOPLE) {
                System.out.println(person.getName() + "   " + person.getBirthday().toString());
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
