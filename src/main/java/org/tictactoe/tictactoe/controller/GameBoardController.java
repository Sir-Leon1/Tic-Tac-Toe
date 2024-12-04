package org.tictactoe.tictactoe.controller;

import org.tictactoe.tictactoe.view.GameBoard;

import javafx.scene.control.Button;
import org.tictactoe.tictactoe.view.View;

public class GameBoardController {
    private GameBoard gameBoard;
    private Button quitButton;
    private View view;
    private GameOverController gameOverController;

    public GameBoardController(GameBoard gameBoard, View view) {
        this.gameBoard = gameBoard;
        this.view = view;
        initializeController();
    }

    private void initializeController() {
        Button[][] board = gameBoard.getBoardButtons();

        //Add click handlers for all board buttons
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                final int row = i;
                final int col = j;
                board[i][j].setOnAction(e -> handleMove(row, col));
            }
        }
        //todo : setup an action listener for the quit button
        quitButton = gameBoard.getQuitButton();
        gameOverController = new GameOverController();
        quitButton.setOnAction(e -> gameOverController.showDialog(view));

    }

    private void handleMove(int row, int col) {
        makePlayerMove(row, col);
    }
    private void  makePlayerMove(int row, int col) {
        gameBoard.getBoardButtons()[row][col].setText("X");
    }
    private void makeComputerMove() {}

}