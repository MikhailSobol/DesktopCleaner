import controller.FilesMover;
import model.FilesContainer;
import view.executables.UiRunner;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) throws IOException, InterruptedException {
        final UiRunner uiRunner = new UiRunner();
        uiRunner.start();
        uiRunner.join();
    }

}
