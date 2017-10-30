package com.javarush.task.task31.task3110;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * Created by Pradd on 30.10.2017.
 */
public class Archiver {

    public static void main(String[] args) {

        try (BufferedReader consoleReader = new BufferedReader(new InputStreamReader(System.in))) {
            System.out.println("Введите полный пусть архива (включая имя файла): ");
            Path archivePath = Paths.get(consoleReader.readLine());
            ZipFileManager zipManager = new ZipFileManager(archivePath);
            System.out.println("Введите полный путь файла, который требуется заархивировать: ");
            Path fileToArchivePath = Paths.get(consoleReader.readLine());
            zipManager.createZip(fileToArchivePath);
        } catch (IOException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
