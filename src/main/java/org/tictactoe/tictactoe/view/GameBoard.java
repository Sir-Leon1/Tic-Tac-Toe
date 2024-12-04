package org.tictactoe.tictactoe.view;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Label;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.text.Font;
import org.tictactoe.tictactoe.TicTacToeApp;

import java.util.Random;

public class GameBoard {
    private TicTacToeApp app;
    private BorderPane layout;
    private Button[][] board = new Button[3][3];
    private Button quitButton;
    private Label turnLabel = new Label("Your Turn");
    private Label scoreLabel = new Label("Score - You: 0 Computer: 0");
    private int playScore = 0;
    private int computerScore = 0;
    private boolean isPlayerTurn = true;
    private Random random = new Random();

    public GameBoard () {
        this.app = app;
        layout = new BorderPane();
        layout.setPadding(new Insets(15));
        layout.getStyleClass().add("layout");


        //Top section with quit, label, score
        HBox topSection = new HBox(20);
        topSection.setAlignment(Pos.CENTER);

        quitButton = new Button("Quit");
        quitButton.getStyleClass().add("custom-button");
        turnLabel = new Label("Your Turn");
        turnLabel.setFont(Font.font(16));
        scoreLabel = new Label("Score - You: 0 Computer: 0");
        scoreLabel.getStyleClass().add("text");
        scoreLabel.setFont(Font.font(16));

        topSection.getChildren().addAll(quitButton, turnLabel, scoreLabel);
        layout.setTop(topSection);

        GridPane gameBoard = createGameBoard();
        gameBoard.setAlignment(Pos.CENTER);
        layout.setCenter(gameBoard);
    }

    private GridPane createGameBoard() {
        GridPane gridPane = new GridPane();
        gridPane.setHgap(5);
        gridPane.setVgap(5);

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                Button cell = new Button();
                cell.setPrefSize(100, 100);
                cell.setFont(Font.font(24));
                board[i][j] = cell;
                gridPane.add(cell, j, i);
            }
        }

        return gridPane;
    }

    public BorderPane getLayout() {
        return layout;
    }
    public Button[][] getBoardButtons() {
        return board;
    }
    public Label getScoreLabel() {
        return scoreLabel;
    }
    public Button getQuitButton() {
        return quitButton;
    }

    public void updateScore(int playerScore, int computerScore) {
        scoreLabel.setText(String.format("Score - You: %d Computer: %d", playerScore, computerScore));
    }

    public void clearBoard() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                board[i][j].setText("");
            }
        }
    }
}
