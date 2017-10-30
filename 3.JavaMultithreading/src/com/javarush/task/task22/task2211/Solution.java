package com.javarush.task.task22.task2211;

import java.io.*;
import java.nio.charset.Charset;

/* 
Смена кодировки
*/
public class Solution {
    static String win1251TestString = "РќР°СЂСѓС€РµРЅРёРµ РєРѕРґРёСЂРѕРІРєРё РєРѕРЅСЃРѕР»Рё?"; //only for your testing

    public static void main(String[] args) throws IOException {

        InputStream fileReader = new FileInputStream(args[0]);
        OutputStream fileWriter = new FileOutputStream(args[1]);

        Charset windows = Charset.forName("Windows-1251");
        Charset uni = Charset.forName("UTF-8");

        byte[] bytes = new byte[fileReader.available()];


            fileReader.read(bytes);


        String s = new String(bytes, uni);
        byte[] buffer = s.getBytes(windows);
        fileWriter.write(buffer);
    }
}
