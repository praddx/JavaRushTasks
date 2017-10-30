package com.javarush.task.task18.task1828;

/* 
Прайсы 2
*/

import java.io.*;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader consoleReader = new BufferedReader(new InputStreamReader(System.in));
        String filePath = consoleReader.readLine();
        BufferedReader fileReader = new BufferedReader(new FileReader(filePath));
        List<String> fileContents = new ArrayList<>();


        String line = "";
        while (fileReader.ready()) {
            line = fileReader.readLine();
            fileContents.add(line);
        }

        int lastId = Integer.parseInt(line.substring(0, 8).trim());
        fileReader.close();

        if (args[0].equals("-u")) {
            String newEntry = String.format(Locale.ENGLISH,"%-8s%-30s%-8.2f%-4s", args[1], args[2], Double.parseDouble(args[3]), args[4]);
            for (int i = 0; i < fileContents.size(); i++) {
                if (fileContents.get(i).startsWith(args[1])){
                    fileContents.set(i, newEntry);
                }
            }
        } else if (args[0].equals("-d")) {
            Iterator<String> it = fileContents.iterator();
            while (it.hasNext()) {
                if (it.next().startsWith(args[1])) {
                    it.remove();
                }
            }
        }



        BufferedWriter fileWriter = new BufferedWriter(new FileWriter(filePath));
        for (String element : fileContents) {
            fileWriter.write(element + "\n");
        }

        fileWriter.close();


    }
}
