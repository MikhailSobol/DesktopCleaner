package controller;


import model.Constants;

import java.io.File;

public class DirectionController {

    public static String getPathToMove(final File file) {
        final String fileFormat = getFileFormat(file);
        if (Constants.getFilesTypesWithSeparateFolder().contains(fileFormat)) {
            return Constants.getDefaultPathToMove() + DateController.getCurrentDate()
                    + Constants.getPathSeparator() + getFolderByFormat(fileFormat)
                    + Constants.getPathSeparator();
        } else {
            return Constants.getDefaultPathToMove() + DateController.getCurrentDate() + Constants.getPathSeparator();
        }
    }

    private static String getFolderByFormat(final String format) {
        String result = "";
        switch (format) {
            case "jpg":
            case "png": result = "pictures"; break;
            case "mp3": result = "music"; break;
            case "py":
            case "java":
            case "cpp":
            case "hpp": result = "programs"; break;
            case "exe": result = "executables"; break;
        }
        return result;
    }

    private static String getFileFormat(final File file) {
        final int point = file.getName().indexOf(".");
        return point > 0 ? file.getName().substring(point + 1) : "";
    }

}
