package com.javarush.task.task15.task1529;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Осваивание статического блока
*/

public class Solution {
    public static void main(String[] args) {

    }
    
    static {
        reset();

    }

    public static Flyable result;

    public static void reset() {
       BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
       String typeOfTransport = "";

        try {

            typeOfTransport = bufferedReader.readLine();

            if (typeOfTransport.equals("helicopter")) {
                result = new Helicopter();

            } else if (typeOfTransport.equals("plane")) {
                result = new Plane(Integer.parseInt(bufferedReader.readLine()));

            }

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                bufferedReader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
