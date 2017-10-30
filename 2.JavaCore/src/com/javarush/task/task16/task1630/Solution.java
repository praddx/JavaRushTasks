package com.javarush.task.task16.task1630;

import java.io.*;

public class Solution {
    public static String firstFileName;
    public static String secondFileName;
    public static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    //add your code here - добавьте код тут
    static{
        try {
            firstFileName = reader.readLine();
            secondFileName = reader.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (reader != null) {
                try {
                    reader.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public static void main(String[] args) throws InterruptedException {

        systemOutPrintln(firstFileName);
        systemOutPrintln(secondFileName);
    }

    public static void systemOutPrintln(String fileName) throws InterruptedException {
        ReadFileInterface f = new ReadFileThread();
        f.setFileName(fileName);
        f.start();
        //add your code here - добавьте код тут
        f.join();
        System.out.println(f.getFileContent());
    }

    public interface ReadFileInterface extends Runnable {

        void setFileName(String fullFileName);

        String getFileContent();

        void join() throws InterruptedException;

        void start();
    }

    //add your code here - добавьте код тут
    public static class ReadFileThread implements ReadFileInterface{
        String fileName;
        String fileContent = "";

        @Override
        public void setFileName(String fullFileName) {
            this.fileName = fullFileName;
        }

        @Override
        public String getFileContent() {

            return fileContent;
        }

        @Override
        public void join() throws InterruptedException {

            while (!Thread.currentThread().isInterrupted()) {

            }
        }

        @Override
        public void start() {
            run();
        }

        @Override
        public void run() {
            try {
                BufferedReader fileReader = new BufferedReader(new InputStreamReader(new FileInputStream(fileName)));
                String lineFromFile;
                while ((lineFromFile = fileReader.readLine()) != null) {

                    fileContent += lineFromFile + " ";
                    //System.out.println(fileContent);
                }
                fileReader.close();
                Thread.currentThread().interrupt();
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
