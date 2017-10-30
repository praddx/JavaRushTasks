package com.javarush.task.task19.task1917;

/* 
Свой FileWriter
*/

import java.io.File;
import java.io.FileDescriptor;
import java.io.FileWriter;
import java.io.IOException;

public class FileConsoleWriter {

    private FileWriter fileWriter;

    public FileConsoleWriter (File file) throws IOException {
        this.fileWriter = new FileWriter(file);
    }

    public FileConsoleWriter (File file, boolean append) throws IOException {
        this.fileWriter = new FileWriter(file, append);
    }

    public FileConsoleWriter (FileDescriptor fd) {
        this.fileWriter = new FileWriter(fd);
    }

    public FileConsoleWriter (String fileName) throws IOException {
        this.fileWriter = new FileWriter(fileName);
    }

    public FileConsoleWriter (String fileName, boolean append) throws IOException {
        this.fileWriter = new FileWriter(fileName, append);
    }

    public void write(char[] cbuf, int off, int len) throws IOException {
        fileWriter.write(cbuf, off, len);
        StringBuilder line = new StringBuilder();
        for (int i = off; i < off + len; i++) {
            line.append(cbuf[i]);
        }

        System.out.println(line.toString());
    }

    public void write(int c) throws IOException {
        fileWriter.write(c);
        System.out.println(c);
    }

    public void write(String str) throws IOException {
        fileWriter.write(str);
        System.out.println(str);
    }

    public void write(String str, int off, int len) throws IOException {
        fileWriter.write(str, off, len);
        System.out.println(str.substring(off, off + len));
    }

    public void write(char[] cbuf) throws IOException {
        fileWriter.write(cbuf);
        StringBuilder builder = new StringBuilder();
        for (char c : cbuf) {
            builder.append(c);
        }
        System.out.println(builder.toString());
    }

    public void close() throws IOException {
        fileWriter.close();
    }

    public static void main(String[] args) {

    }

}
