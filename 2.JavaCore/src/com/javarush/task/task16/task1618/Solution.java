package com.javarush.task.task16.task1618;

/* 
Снова interrupt
*/

public class Solution {
    public static void main(String[] args) throws InterruptedException {
        Thread testTherad = new TestThread();
        testTherad.start();
        Thread.sleep(5000);
        testTherad.interrupt();
    }

    //Add your code below - добавь код ниже
    public static class TestThread extends Thread {
        int count = 0;
        public void run() {
            try {
                while(!isInterrupted()) {

                    Thread.sleep(500);
                    System.out.println(++count);
                }

            }catch (InterruptedException e) {
            }
        }
    }
}