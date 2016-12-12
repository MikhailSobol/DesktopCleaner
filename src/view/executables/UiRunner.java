package view.executables;


import view.MainWindow;

public class UiRunner extends Thread {

    @Override
    public void run() {
        final MainWindow mainWindow = new MainWindow();
        final Thread mainWindowThread = new Thread(mainWindow, "mainWindowThread");
        mainWindowThread.start();
        try {
            mainWindowThread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
