package com.javarush.task.task18.task1812;

import java.io.*;

/* 
Расширяем AmigoOutputStream
*/

public class QuestionFileOutputStream implements AmigoOutputStream {

    private AmigoOutputStream amigoStream;

    public QuestionFileOutputStream(AmigoOutputStream amigo) {
        this.amigoStream = amigo;
    }

    @Override
    public void flush() throws IOException {
        this.amigoStream.flush();

    }

    @Override
    public void write(int b) throws IOException {
        this.amigoStream.write(b);
    }

    @Override
    public void write(byte[] b) throws IOException {
        this.amigoStream.write(b);
    }

    @Override
    public void write(byte[] b, int off, int len) throws IOException {
        this.amigoStream.write(b, off, len);
    }

    @Override
    public void close() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String answer;
        System.out.println("Вы действительно хотите закрыть поток? Д/Н");
        answer = reader.readLine();
        reader.close();
        if (answer.equals("Д")) {
            this.amigoStream.close();
        }

    }
}

