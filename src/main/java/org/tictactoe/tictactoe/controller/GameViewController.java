package org.tictactoe.tictactoe.controller;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import org.tictactoe.tictactoe.view.GameView;

public class GameViewController {
    private GameView view;

    public GameViewController(GameView view) {
        this.view = view;
        addEventHandlers();
    }

    private void addEventHandlers() {
        view.getNewGameButton().setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                handleNewGameButtonAction(event);
            }
        });

        view.getResetButton().setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                handleResetButtonAction(event);
            }
        });

        view.getLogOutButton().setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                handleLogOutButtonAction(actionEvent);
            }
        });
        // Add more event handlers for other buttons if needed
    }

    private void handleNewGameButtonAction(ActionEvent event) {
        System.out.println("New Game Button Clicked");
        view.getView().showGameBoardScene();
    }
    private void handleResetButtonAction(ActionEvent event) {
        System.out.println("Reset Button Clicked");
    }
    private void handleLogOutButtonAction(ActionEvent event) {
        view.getView().showLoginScene();
        System.out.println("Log Out Button Clicked");
    }
}