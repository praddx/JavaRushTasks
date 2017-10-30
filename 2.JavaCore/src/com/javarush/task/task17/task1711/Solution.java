package com.javarush.task.task17.task1711;

import com.javarush.task.task17.task1710.*;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;

/* 
CRUD 2
*/

public class Solution {
    public static volatile List<Person> allPeople = new ArrayList<Person>();

    static {
        allPeople.add(Person.createMale("Иванов Иван", new Date()));  //сегодня родился    id=0
        allPeople.add(Person.createMale("Петров Петр", new Date()));  //сегодня родился    id=1
    }

    public static void main(String[] args) {
        int numberOfEntries;
        SimpleDateFormat df = new SimpleDateFormat("dd/MM/yyy", Locale.ENGLISH);
        int id;
        switch (args[0]) {
            case  "-c":
                synchronized (allPeople) {
                    numberOfEntries = args.length / 3;

                    try {
                        for (int i = 0; i < numberOfEntries; i++) {

                            Date birthDate = df.parse(args[3 + 3 * i]);
                            if (args[2 + 3 * i].equals("м")) {
                                allPeople.add(Person.createMale(args[1 + 3 * i], birthDate));
                            } else {
                                allPeople.add(Person.createFemale(args[1 + 3 * i], birthDate));
                            }
                            System.out.println(allPeople.size() - 1);

                        }

                    } catch (ParseException e) {
                        e.printStackTrace();
                    }
                }

                break;

            case "-u":
                numberOfEntries = args.length / 4;
                synchronized (allPeople) {
                    for (int i = 0; i < numberOfEntries; i++) {
                        id = Integer.parseInt(args[1 + 4 * i]);
                        allPeople.get(id).setName(args[2 + 4 * i]);
                        if (args[3 + 4 * i].equals("м")) {
                            allPeople.get(id).setSex(Sex.MALE);
                        } else {
                            allPeople.get(id).setSex(Sex.FEMALE);
                        }

                        try {
                            allPeople.get(id).setBirthDay(df.parse(args[4 + 4 * i]));
                        } catch (ParseException e) {
                        }
                    }
                }
                break;

            case "-d":
                numberOfEntries = args.length - 1;
                synchronized (allPeople) {
                    for (int i = 0; i < numberOfEntries; i++) {
                        id = Integer.parseInt(args[1 + i]);

                        allPeople.get(id).setName(null);
                        allPeople.get(id).setSex(null);
                        allPeople.get(id).setBirthDay(null);
                    }
                }
                break;

            case "-i":
                numberOfEntries = args.length - 1;
                synchronized (allPeople) {
                    for (int i = 0; i < numberOfEntries; i++) {
                        System.out.print(allPeople.get(Integer.parseInt(args[1 + i])).getName() + " ");
                        if (allPeople.get(Integer.parseInt(args[1 + i])).getSex() == Sex.MALE) {
                            System.out.print("м ");
                        } else {
                            System.out.println("ж ");
                        }
                        DateFormat dateFormat = new SimpleDateFormat("dd-MMM-yyyy", Locale.ENGLISH);
                        System.out.println(dateFormat.format(allPeople.get(Integer.parseInt(args[1 + i])).getBirthDay()));
                    }
                }
                break;
        }
    }
}
