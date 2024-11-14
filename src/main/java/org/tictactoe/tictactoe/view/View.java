package org.tictactoe.tictactoe.view;

import javafx.scene.Scene;
import javafx.stage.Stage;
import org.tictactoe.tictactoe.controller.GameBoardController;

public class View {
    private Stage stage;
    private GameBoard gameboard;
    private GameBoardController gameboardController;

    public View(Stage stage) {
        this.stage = stage;
        //todo: Ensure the first method called is show login page
        showGameBoardScene();
    }

    public void showGameBoardScene() {
        gameboard = new GameBoard();
        gameboardController = new GameBoardController(gameboard);
        stage.setScene(new Scene(gameboard.getLayout(), 800, 900));
        stage.setTitle("Tic Tac Toe");
        stage.show();
    }

    public void showLoginScene() {}

    public void showHomeScene() {}

    public GameBoard getGameboardInstance() {
        return gameboard;
    }


}
