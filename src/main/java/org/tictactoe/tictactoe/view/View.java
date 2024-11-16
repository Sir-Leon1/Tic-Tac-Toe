package org.tictactoe.tictactoe.view;

import javafx.scene.Scene;
import javafx.stage.Stage;
import org.tictactoe.tictactoe.controller.GameBoardController;

public class View {
    private Stage stage;
    private GameBoard gameboard;
    private GameView gameView;
    private LoginForm loginForm;
    private Scene scene;
    private GameBoardController gameboardController;

    public View(Stage stage) {
        this.stage = stage;
        //todo: Ensure the first method called is show login page
        showLoginScene();
    }

    public void showGameBoardScene() {
        gameboard = new GameBoard();
        gameboardController = new GameBoardController(gameboard);
        stage.setScene(new Scene(gameboard.getLayout(), 800, 900));
        stage.setTitle("Tic Tac Toe");
        stage.show();
    }

    public void showLoginScene() {
        loginForm = new LoginForm(this);
        scene = new Scene(loginForm.createLoginForm(), 800, 900);
        scene.getStylesheets().add(getClass().getResource("/style.css").toExternalForm());
        stage.setScene(scene);
        stage.setTitle("Tic Tac Toe Login");
        stage.show();
    }

    public void showHomeScene() {
        gameView = new GameView(this);
        scene = new Scene(gameView.getContent(), 800, 900);
        scene.getStylesheets().add(getClass().getResource("/style.css").toExternalForm());
        stage.setScene(scene);
        stage.setTitle("TicTacToe Home");
        stage.show();
    }

    public GameBoard getGameboardInstance() {
        return gameboard;
    }


}
