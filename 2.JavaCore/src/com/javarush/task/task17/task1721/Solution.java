package com.javarush.task.task17.task1721;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

/* 
Транзакционность
*/

public class Solution {
    public static List<String> allLines = new ArrayList<String>();
    public static List<String> forRemoveLines = new ArrayList<String>();


    public static void main(String[] args) {

        Solution solutionObject = new Solution();

        BufferedReader consoleReader = new BufferedReader(new InputStreamReader(System.in));
        try {
            BufferedReader firstFileReader = new BufferedReader(new FileReader(consoleReader.readLine()));
            BufferedReader secondFileReader = new BufferedReader(new FileReader(consoleReader.readLine()));
            consoleReader.close();
            String line;

            while((line = firstFileReader.readLine()) != null) {
                solutionObject.allLines.add(line);
            }
            firstFileReader.close();

            while ((line = secondFileReader.readLine()) != null) {
                solutionObject.forRemoveLines.add(line);
            }
            secondFileReader.close();

            solutionObject.joinData();


        } catch (CorruptedDataException e) {
            System.out.println("Corrupted Data");
        }
          catch (IOException e) {}

    }

    public void joinData () throws CorruptedDataException {
        int count = 0;
        for (String lineFromRemoveList : forRemoveLines) {
            if (allLines.contains(lineFromRemoveList)) {
                count++;
            }
        }

        if (count == forRemoveLines.size()) {
            allLines.removeAll(forRemoveLines);
            System.out.println("all is ok");
        } else {
            allLines.clear();
            throw new CorruptedDataException();
        }
    }
}
