package controller;


import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class FilesMover {

    public static void moveFiles(final List<File> files) throws IOException {
        for (final File file : files) {
            final String pathToMove = DirectionController.getPathToMove(file);
            DirectoryController.createDirectory(pathToMove);
            if (Files.exists(Paths.get(pathToMove + file.getName()))) {
                file.delete();
                continue;
            }
            move(file, pathToMove);
        }
    }

    private static void move(final File file,
                             final String path) throws IOException {
        Files.move(Paths.get(file.getPath()), Paths.get(path + file.getName()));
    }

}
