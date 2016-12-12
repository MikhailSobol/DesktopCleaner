package view;


import controller.FilesMover;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.text.TextFlow;
import model.Constants;
import model.FilesContainer;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class MainWindowController implements Initializable {

    private FilesContainer filesContainer;

    @FXML
    private TextArea filesTextArea;

    @FXML
    private void cleanButtonOnAction() throws IOException {
        FilesMover.moveFiles(filesContainer.getListOfFiles());
        updateFiles();
    }

    @FXML
    private void updateButtonOnAction() {
        updateFiles();
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        updateFiles();
    }

    private void updateFiles() {
        filesContainer = new FilesContainer();
        fillInTextFiled();
    }

    private void fillInTextFiled() {
        filesTextArea.clear();
        for (final File file : filesContainer.getListOfFiles()) {
            filesTextArea.appendText(file.getName() + "\n");
        }
        if (filesTextArea.getText().isEmpty()) {
            filesTextArea.setText(Constants.getNoFilesText());
        }
    }

}
