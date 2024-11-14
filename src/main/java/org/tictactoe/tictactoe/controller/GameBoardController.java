package org.tictactoe.tictactoe.controller;

import org.tictactoe.tictactoe.view.GameBoard;

import javafx.scene.control.Button;

public class GameBoardController {
    private GameBoard view;

    public GameBoardController(GameBoard view) {
        this.view = view;
        initializeController();
    }

    private void initializeController() {
        Button[][] board = view.getBoardButtons();

        //Add click handlers for all board buttons
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                final int row = i;
                final int col = j;
                board[i][j].setOnAction(e -> handleMove(row, col));
            }
        }
        //todo : setup an action listener for the quit button
        view.getQuitButton();

    }

    private void handleMove(int row, int col) {
        makePlayerMove(row, col);
    }
    private void  makePlayerMove(int row, int col) {
        view.getBoardButtons()[row][col].setText("X");
    }
    private void makeComputerMove() {}

}
