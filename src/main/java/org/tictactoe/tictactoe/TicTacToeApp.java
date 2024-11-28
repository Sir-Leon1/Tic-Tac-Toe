package org.tictactoe.tictactoe;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;
import org.tictactoe.tictactoe.view.GameBoard;
import org.tictactoe.tictactoe.view.View;

import java.io.IOException;


public class TicTacToeApp extends Application {
    private Stage stage;
    private View view;

    @Override
    public void start(Stage stage) throws IOException {
        this.stage = stage;
        view = new View(stage);

    }

    public static void main(String[] args) {
        launch();
    }
}