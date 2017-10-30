package com.javarush.task.task06.task0610;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

/* 
Класс ConsoleReader
*/

public class ConsoleReader {
    public static String readString() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        return br.readLine();
    }

    public static int readInt() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        return Integer.parseInt(br.readLine());
    }

    public static double readDouble() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        return Double.parseDouble(br.readLine());
    }

    public static boolean readBoolean() throws Exception {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextBoolean();
    }

    public static void main(String[] args) {
    }
}
