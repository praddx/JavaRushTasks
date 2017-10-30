package com.javarush.task.task25.task2508;

public class TaskManipulator implements Runnable, CustomThreadManipulator {


    Thread thread;


    @Override
    public void run() {

            System.out.println(thread.getName());
            while(!thread.isInterrupted()) {
                try {
                    thread.sleep(100);
                    System.out.println(thread.getName());
                } catch (InterruptedException e) {

                }
            }

    }

    @Override
    public void start(String threadName) {
        this.thread = new Thread(this, threadName);
        this.thread.start();
    }

    @Override
    public void stop() {
        this.thread.interrupt();
    }
}
