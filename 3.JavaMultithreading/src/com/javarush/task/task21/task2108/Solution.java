package com.javarush.task.task21.task2108;

import java.util.ArrayList;
import java.util.Arrays;

/*
Клонирование растений
*/
public class Solution {
    public static void main(String[] args) {
        Tree tree = new Tree("willow", new String[]{"s1", "s2", "s3", "s4"});
        Tree clone = null;
        try {
            clone = tree.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }

        System.out.println(tree);
        System.out.println(clone);

        System.out.println(tree.branches);
        System.out.println(clone.branches);
    }

    public static class Plant{
        private String name;

        public Plant(String name) {
            this.name = name;
        }

        public String getName() {
            return name;
        }
    }

    public static class Tree extends Plant implements Cloneable{
        private String[] branches;

        public Tree(String name, String[] branches) {
            super(name);
            this.branches = branches;
        }

        public String[] getBranches() {
            return branches;
        }

        public Tree clone() throws CloneNotSupportedException {
            Tree clonedTree;
            clonedTree = (Tree)super.clone();
            clonedTree.branches = new String[branches.length];

                /*for (int i = 0; i < branches.length; i++) {
                    clonedTree.branches[i] = (String) branches[i].clone();
                }*/
            clonedTree.branches = Arrays.copyOf(branches, branches.length);

            return clonedTree;
        }

    }



}
