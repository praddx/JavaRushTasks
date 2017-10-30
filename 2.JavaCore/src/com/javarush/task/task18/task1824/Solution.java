package com.javarush.task.task18.task1824;

/* 
Файлы и исключения
*/

import javafx.collections.transformation.FilteredList;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Solution {
    public static void main(String[] args) {

        BufferedReader consoleReader = new BufferedReader(new InputStreamReader(System.in));
        List<FileInputStream> fileReadersList = new ArrayList<>();
        FileInputStream reader = null;
        String filePath = "";
        while(!Thread.currentThread().isInterrupted()) {
            try {
                filePath = consoleReader.readLine();
                //System.out.println(filePath);
                reader = new FileInputStream(filePath);
                fileReadersList.add(new FileInputStream(filePath));
                //reader.close();
            } catch (FileNotFoundException e) {
                System.out.println(filePath);
                break;
            } catch (IOException e) {

            }finally {
                try {
                    for (FileInputStream entry : fileReadersList) {
                    if (entry != null)
                        entry.close();
                    }
                } catch (IOException e) {}
            }
        }
    }
}
