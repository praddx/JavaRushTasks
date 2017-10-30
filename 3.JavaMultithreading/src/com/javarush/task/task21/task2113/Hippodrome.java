package com.javarush.task.task21.task2113;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Pradd on 04.10.2017.
 */
public class Hippodrome {

    private List<Horse> horses = new ArrayList<>();

    public static Hippodrome game;

    public Hippodrome(List<Horse> horses) {
        this.horses = horses;
    }

    public List<Horse> getHorses() {
        return this.horses;
    }

    public void run() {
        for (int i = 0; i < 100; i++) {
            move();
            print();
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                System.out.println("Sleeping interrupted");
            }
        }

    }

    public void move() {
        for (Horse horse : horses) {
            horse.move();
        }
    }

    public void print() {
        for (Horse horse : horses) {
            horse.print();
        }
        for (int i = 0; i < 10; i++) {
            System.out.println();
        }

//            System.out.println("\n\n\n\n\n\n\n\n\n");

    }

    public Horse getWinner() {
        Horse winner = horses.get(0);
        for (int i = 1; i < horses.size(); i++) {
            if (winner.getDistance() < horses.get(i).getDistance()) {
                winner = horses.get(i);
            }
        }
        return winner;
    }

    public void printWinner() {
        System.out.print("Winner is " + getWinner().getName() + "!");
    }



    public static void main(String[] args) {
        game = new Hippodrome(new ArrayList<>());

        game.getHorses().add(new Horse("Rosy", 3.0, 0.0));
        game.getHorses().add(new Horse("Pumpkin", 3.0, 0.0));
        game.getHorses().add(new Horse("Red", 3.0, 0.0));

        game.run();
        game.printWinner();
    }
}
