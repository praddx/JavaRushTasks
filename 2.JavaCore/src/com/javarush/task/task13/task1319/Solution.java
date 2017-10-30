package com.javarush.task.task13.task1319;


import java.io.*;

/* 
Писатель в файл с консоли
*/

public class Solution {
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try {
            String filePath = br.readLine();
            BufferedWriter bufferedWriter = new BufferedWriter((new FileWriter(filePath)));

            String enteredText = "";

            while (!enteredText.equals("exit")) {
                enteredText = br.readLine();
                bufferedWriter.write(enteredText);
                bufferedWriter.write("\n");
            }

            /*InputStream fileInputStream = new FileInputStream(filePath);
            while (fileInputStream.available() > 0) {
                System.out.print(fileInputStream.read());
            }*/

            br.close();
            bufferedWriter.close();
            //fileInputStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
