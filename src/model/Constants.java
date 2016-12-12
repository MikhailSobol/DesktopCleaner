package model;


import java.io.File;
import java.util.HashSet;

public abstract class Constants {

    private static final String NO_FILES_TEXT = "Desktop is clean.";

    private static final String APP_NAME = "DesktopCleaner";

    private static final String SAVE_FOLDER_NAME = "DesktopCleaner_Saves";

    private static final String SAVE_FILE_NAME = "DesktopCleanerSaveFile.txt";

    private static final String PATH_SEPARATOR = File.separator;

    private static final String DESKTOP_PATH = System.getProperty("user.home")
            + PATH_SEPARATOR + "Desktop" + PATH_SEPARATOR;

    private static final String SAVE_PATH = System.getProperty("user.home") +
            PATH_SEPARATOR + SAVE_FOLDER_NAME + PATH_SEPARATOR + SAVE_FILE_NAME;

    private static final HashSet<String> FILES_TYPES_WITH_SEPARATE_FOLDER = new HashSet<String>(5) {{
        add("mp3");
        add("jpeg");
        add("png");
        add("exe");
        add("java");
        add("py");
        add("cpp");
        add("hpp");
    }};

    public static String getDefaultPathToMove() {
        return DEFAULT_PATH_TO_MOVE;
    }

    private static final String DEFAULT_PATH_TO_MOVE = System.getProperty("user.home") +
            PATH_SEPARATOR + APP_NAME + PATH_SEPARATOR;

    public static HashSet<String> getFilesTypesWithSeparateFolder() {
        return FILES_TYPES_WITH_SEPARATE_FOLDER;
    }

    public static String getNoFilesText() {
        return NO_FILES_TEXT;
    }

    public static String getAppName() {
        return APP_NAME;
    }

    public static String getSaveFolderName() {
        return SAVE_FOLDER_NAME;
    }

    public static String getSaveFileName() {
        return SAVE_FILE_NAME;
    }

    public static String getPathSeparator() {
        return PATH_SEPARATOR;
    }

    public static String getDesktopPath() {
        return DESKTOP_PATH;
    }

    public static String getSavePath() {
        return SAVE_PATH;
    }
}
