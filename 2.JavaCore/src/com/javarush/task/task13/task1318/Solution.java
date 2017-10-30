package com.javarush.task.task13.task1318;

//import com.sun.xml.internal.ws.policy.privateutil.PolicyUtils;

import java.io.*;
import java.util.Scanner;

/* 
Чтение файла
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));


            String filePath = br.readLine();
        br.close();

        InputStream inStream = new FileInputStream(filePath);

        while (inStream.available() > 0) {
            System.out.print((char) inStream.read());
        }
        System.out.println();
        inStream.close();

    }
}