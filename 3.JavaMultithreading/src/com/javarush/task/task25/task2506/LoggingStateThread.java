package com.javarush.task.task25.task2506;

//import static java.lang.Thread.State.*;

/**
 * Created by Pradd on 17.10.2017.
 */
public class LoggingStateThread extends Thread {

    private Thread thread;

    public LoggingStateThread(Thread thread) {
        this.thread = thread;
    }

    public void run() {
        Thread.State state = thread.getState();
        System.out.println(state.toString());
        while (thread.getState() != State.TERMINATED) {
            if (thread.getState() != state) {
                state = thread.getState();
                System.out.println(state.toString());
            }
        }
        state = thread.getState();
        System.out.println(state.toString());

        Thread.interrupted();
    }
}
