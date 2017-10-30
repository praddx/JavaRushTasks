package com.javarush.task.task17.task1710;

import java.text.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;

/* 
CRUD
*/

public class Solution {
    public static List<Person> allPeople = new ArrayList<Person>();

    static {
        allPeople.add(Person.createMale("Иванов Иван", new Date()));  //сегодня родился    id=0
        allPeople.add(Person.createMale("Петров Петр", new Date()));  //сегодня родился    id=1

    }

    public static void main(String[] args) {

        switch (args[0]) {
            case "-c":
                SimpleDateFormat df = new SimpleDateFormat("dd/MM/yyy", Locale.ENGLISH);
                try {
                    Date birthDate = df.parse(args[3]);

                /*String name;
                Date birthDate;
                String sex;
                if (args.length == 5) {
                    name = args[1] + " " + args[2];
                    birthDate = new Date(args[4]);
                    sex = args[3];
                } else {
                    name = args[1];
                    birthDate = new Date(args[3]);
                    sex = args[2];
                }*/
                //System.out.println(name);
                if (args[2].equals("м")) {
                    allPeople.add(Person.createMale(args[1], birthDate));
                } else {
                    allPeople.add(Person.createFemale(args[1], birthDate));
                }
                System.out.println(allPeople.size() - 1);
                /*for (Person person : allPeople) {
                    System.out.println(person.getName());
                }*/
        } catch (ParseException e) {
            e.printStackTrace();
        }

                break;

            case "-u":
                int id = Integer.parseInt(args[1]);
                SimpleDateFormat dfU = new SimpleDateFormat("dd/MM/yyy", Locale.ENGLISH);
                /*try {
                    Date birthDate = dfU.parse(args[3]);
                    if (args[2].equals("м")) {
                        allPeople.add(Person.createMale(args[1], birthDate));
                    } else {
                        allPeople.add(Person.createFemale(args[1], birthDate));
                    }
                } catch (ParseException e) {
                    e.printStackTrace();
                }*/


                allPeople.get(id).setName(args[2]);
                if (args[3].equals("м")) {
                    allPeople.get(id).setSex(Sex.MALE);
                } else {
                    allPeople.get(id).setSex(Sex.FEMALE);
                }
                try {
                    allPeople.get(id).setBirthDay(dfU.parse(args[4]));
                } catch(ParseException e) {}
                break;

            case "-d":
                int idD = Integer.parseInt(args[1]);

                allPeople.get(idD).setName(null);
                allPeople.get(idD).setSex(null);
                allPeople.get(idD).setBirthDay(null);
                break;

            case "-i":
                System.out.print(allPeople.get(Integer.parseInt(args[1])).getName() + " ");
                if (allPeople.get(Integer.parseInt(args[1])).getSex() == Sex.MALE) {
                    System.out.print("м ");
                } else {
                    System.out.println("ж ");
                }
                DateFormat dateFormat = new SimpleDateFormat("dd-MMM-yyyy", Locale.ENGLISH);
                System.out.println(dateFormat.format(allPeople.get(Integer.parseInt(args[1])).getBirthDay()));
                break;
        }
    }
}
