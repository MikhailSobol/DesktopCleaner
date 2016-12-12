package model;


import controller.FilesGetter;

import java.io.File;
import java.util.ArrayList;

public class FilesContainer {

    private final ArrayList<File> listOfFiles;

    public FilesContainer() {
        this.listOfFiles = FilesGetter.getFilesList();
    }

    public ArrayList<File> getListOfFiles() {
        return listOfFiles;
    }
}
