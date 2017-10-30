package com.javarush.task.task15.task1527;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Парсер реквестов
*/

public class Solution {
    public static void main(String[] args) {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String URL = "";
        String[] splittedURL;
        String[] splittedParameters;
        String[] splittedParameter;
        String parametersInURL = "";
        //char[] charURL;
        Double objValue;
        String objString;
        int objIndex;
        try {
            URL = bufferedReader.readLine();


            splittedURL = URL.split("\\?");


            splittedParameters = splittedURL[1].split("&");


            for (int i = 0; i < splittedParameters.length; i++) {
                splittedParameter = splittedParameters[i].split("=");


                parametersInURL += (splittedParameter[0] + " ");
            }

            System.out.println(parametersInURL);

            for (int i = 0; i < splittedParameters.length; i++) {
                splittedParameter = splittedParameters[i].split("=");
                if (splittedParameter[0].equals("obj") && splittedParameter.length == 2) {
                    try {
                        alert(Double.parseDouble(splittedParameter[1]));
                    } catch (NumberFormatException e) {

                        alert(splittedParameter[1]);
                    }
                }
            }
        }catch (IOException e) {
            e.printStackTrace();
        }


    }

    public static void alert(double value) {
        System.out.println("double " + value);
    }

    public static void alert(String value) {
        System.out.println("String " + value);
    }
}
