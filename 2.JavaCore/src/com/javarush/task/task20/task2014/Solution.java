package com.javarush.task.task20.task2014;

import java.io.*;
import java.text.SimpleDateFormat;
import java.util.Date;

/* 
Serializable Solution
*/
public class Solution implements Serializable {
    public static void main(String[] args) {
        System.out.println(new Solution(4));
        try {
            File task2014File = File.createTempFile("G:\\Programming\\Java\\JavaRushTrainingFiles\\CoreQuest\\Utni10\\Task2014", null);
            InputStream inputStream = new FileInputStream(task2014File);
            OutputStream outputStream = new FileOutputStream(task2014File);

            Solution savedObject = new Solution(22);
            ObjectOutputStream objOutputStream = new ObjectOutputStream(outputStream);
            ObjectInputStream objInputStream = new ObjectInputStream(inputStream);

            objOutputStream.writeObject(savedObject);

            Solution newObj = new Solution(15);

            Solution loadedObject = (Solution) objInputStream.readObject();

            System.out.println(loadedObject.string.equals(savedObject.string));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

    }

    private transient final String pattern = "dd MMMM yyyy, EEEE";
    private transient Date currentDate;
    private transient int temperature;
    String string;

    public Solution(int temperature) {
        this.currentDate = new Date();
        this.temperature = temperature;

        string = "Today is %s, and current temperature is %s C";
        SimpleDateFormat format = new SimpleDateFormat(pattern);
        this.string = String.format(string, format.format(currentDate), temperature);
    }

    @Override
    public String toString() {
        return this.string;
    }
}
