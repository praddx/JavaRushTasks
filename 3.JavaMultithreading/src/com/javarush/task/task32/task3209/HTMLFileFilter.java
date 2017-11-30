package com.javarush.task.task32.task3209;

import javax.swing.filechooser.FileFilter;
import java.io.File;

/**
 * Created by Pradd on 29.11.2017.
 */
public class HTMLFileFilter extends FileFilter {

    @Override
    public boolean accept(File f) {
        boolean ans = false;
        if (f.isDirectory() || f.getName().toLowerCase().endsWith(".html") || f.getName().toLowerCase().endsWith(".htm")) {
            ans = true;
        }
        return ans;
    }

    @Override
    public String getDescription() {
        return "HTML и HTM файлы";
    }
}
