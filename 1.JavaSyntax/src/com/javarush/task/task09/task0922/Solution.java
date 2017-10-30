package com.javarush.task.task09.task0922;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.text.DateFormatSymbols;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/* 
Какое сегодня число?
*/

public class Solution {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
       // DateFormatSymbols myDateFomatSimbols = new DateFormatSymbols();
       // myDateFomatSimbols.setMonths(new String[]{"JANUARY", "FEBRUARY", "MARCH", "APRIL", "MAY", "JUNE", "JULY",
       //                                             "AUGUST", "SEPTEMBER", "OCTOBER", "NOVEMBER", "DECEMBER"});

        Date enteredDate = new Date(br.readLine());
        SimpleDateFormat formattedDate = new SimpleDateFormat("MMM d, yyyy", Locale.US);
        System.out.println(formattedDate.format(enteredDate).toUpperCase());
    }
}
