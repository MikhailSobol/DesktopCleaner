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
            move(file, pathToMove);
        }
    }

    private static int countFileCopies(final File file) {
        final String directory = DirectionController.getPathToMove(file);
        int counter = 0;
        while (new File(directory + getFileName(file.getName(), counter)).exists()) counter++;
        return counter;
    }

    private static String getFileName(final String fileName,
                                      final int counter) {
        if (counter == 0) return fileName;
        final int point = fileName.indexOf(".");
        final String fileFormat = point > 0 ? fileName.substring(point + 1) : "";
        final String fileCurrentName = fileName.substring(0, point);
        return "".equals(fileFormat) ? (fileCurrentName + "(" + counter + ")") :
                (fileCurrentName + "(" + counter + ")" + "." + fileFormat);
    }

    private static void move(final File file,
                             final String path) throws IOException {
        Files.move(Paths.get(file.getPath()), Paths.get(path + getFileName(file.getName(), countFileCopies(file))));
    }

}
