package com.javarush.task.task22.task2207;

import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.HashSet;
import java.io.*;

/* 
Обращенные слова
*/
public class Solution {
    public static List<Pair> result = new LinkedList<>();

    public static void main(String[] args) {
        
        Set<String> words = new HashSet<>();
        String fileContents = "";
        
        try (BufferedReader consoleReader = new BufferedReader(new InputStreamReader(System.in));
            BufferedReader fileReader = new BufferedReader(new FileReader(consoleReader.readLine()))) {
                
                String line;
                while ((line = fileReader.readLine()) != null) {
                    fileContents += line + " ";
                }
                
                String[] splitted = fileContents.split(" ");
                for (String word : splitted) {
                    words.add(word);
                }
                
                for (int i = 0; i < splitted.length; i++) {
                    StringBuilder builder = new StringBuilder(splitted[i]);
                    String reversedWord = builder.reverse().toString();
                    
                    if (words.contains(reversedWord)) {
                        result.add(new Pair(splitted[i], reversedWord));
                        words.remove(splitted[i]);
                        words.remove(reversedWord);
                    } else {
                        words.remove(splitted[i]);
                    }
                    
                }
                for (Pair pair : result) {
                    System.out.println(pair.first + "   " + pair.second);
                }
                
                
            } catch (IOException e) {}

    }

    public static class Pair {
        String first;
        String second;
        
        public Pair() {}
        
        public Pair (String first, String second) {
            this.first = first;
            this.second = second;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            Pair pair = (Pair) o;

            if (first != null ? !first.equals(pair.first) : pair.first != null) return false;
            return second != null ? second.equals(pair.second) : pair.second == null;

        }

        @Override
        public int hashCode() {
            int result = first != null ? first.hashCode() : 0;
            result = 31 * result + (second != null ? second.hashCode() : 0);
            return result;
        }

        @Override
        public String toString() {
            return  first == null && second == null ? "" :
                    first == null && second != null ? second :
                    second == null && first != null ? first :
                    first.compareTo(second) < 0 ? first + " " + second : second + " " + first;

        }
    }

}
