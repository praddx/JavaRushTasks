package com.javarush.task.task31.task3110;

import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;



/**
 * Created by Pradd on 30.10.2017.
 */
public class ZipFileManager {
    private Path zipFile;

    public ZipFileManager(Path zipFile) {
        this.zipFile = zipFile;
    }

    public void createZip(Path source) throws Exception {
        try (ZipOutputStream zipOutputStream = new ZipOutputStream(Files.newOutputStream(zipFile))) {

            ZipEntry zipEntry = new ZipEntry(source.getFileName().toString());
            zipOutputStream.putNextEntry(zipEntry);

            try (InputStream inputStream = Files.newInputStream(source)) {
                while (inputStream.available() > 0) {
                    zipOutputStream.write(inputStream.read());
                }
            }
                zipOutputStream.closeEntry();
        }

    }

}
