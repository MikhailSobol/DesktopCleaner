package controller;


import model.Constants;

import java.io.File;
import java.util.ArrayList;

public class FilesGetter {

    public static ArrayList<File> getFilesList() {
        final File desktopFolder = new File(Constants.getDesktopPath());
        final ArrayList<File> listOfFiles = new ArrayList<>(desktopFolder.listFiles().length);
        for (final File file : desktopFolder.listFiles()) if (file.isFile()) listOfFiles.add(file);
        return listOfFiles;
    }

}
