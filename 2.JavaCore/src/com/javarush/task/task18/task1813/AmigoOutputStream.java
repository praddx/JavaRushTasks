package com.javarush.task.task18.task1813;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

/* 
AmigoOutputStream
*/

public class AmigoOutputStream extends FileOutputStream{

    public static String fileName = "C:/tmp/result.txt";
    private FileOutputStream stream;

    public AmigoOutputStream(FileOutputStream amigoStream) throws FileNotFoundException {

            super(String.valueOf(amigoStream));
            //super(amigoStream);
            this.stream = amigoStream;

    }

    public static void main(String[] args) throws FileNotFoundException {
        new AmigoOutputStream(new FileOutputStream(fileName));
    }

    @Override
    public void write(int b) throws IOException {
        this.stream.write(b);
    }

    @Override
    public void close() throws IOException {
        String line = "JavaRush © All rights reserved.";
        this.stream.flush();
        this.stream.write(line.getBytes());
        this.stream.close();
    }

    @Override
    public void flush() throws IOException {
        stream.flush();
    }

    @Override
    public void write(byte[] b) throws IOException {
        stream.write(b);
    }

    @Override
    public void write(byte[] b, int off, int len) throws IOException {
        stream.write(b, off, len);
    }
}
