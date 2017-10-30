package com.javarush.task.task18.task1816;

/* 
Английские буквы
*/

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.regex.Pattern;

public class Solution {
    public static void main(String[] args) {
        try {
            //System.out.println(args[0]);
            FileInputStream fileReader = new FileInputStream(args[0]);
            int amountOfEnglishLetters = 0;
            int simbol;

            while (fileReader.available() > 0) {
                simbol = fileReader.read();
                //System.out.print(simbol + " ");
                if ((simbol >= 65 && simbol <= 90) || (simbol >= 97 && simbol <= 122)) {
                    amountOfEnglishLetters++;
                }
            }
            fileReader.close();
            System.out.println(amountOfEnglishLetters);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
