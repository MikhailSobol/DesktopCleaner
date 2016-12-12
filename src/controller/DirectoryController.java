package controller;


import java.io.File;
import java.nio.file.Files;
import java.nio.file.Paths;

public class DirectoryController {

    public static void createDirectory(final String path) {
        if (checkIfAlreadyExists(path)) return;
        new File(path).mkdirs();
    }

    private static boolean checkIfAlreadyExists(final String path) {
        return Files.exists(Paths.get(path));
    }

}
