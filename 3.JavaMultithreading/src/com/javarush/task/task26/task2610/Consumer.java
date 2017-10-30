package com.javarush.task.task26.task2610;

import java.util.concurrent.BlockingQueue;

/**
 * Created by Pradd on 23.10.2017.
 */
public class Consumer implements Runnable {
    private BlockingQueue queue;

    public Consumer(BlockingQueue queue) {
        this.queue = queue;
    }

    public void run() {
        try {
            while (true) {
                System.out.println(queue.take());
                Thread.sleep(300);
            }
        } catch (InterruptedException e) {

        }
    }
}
