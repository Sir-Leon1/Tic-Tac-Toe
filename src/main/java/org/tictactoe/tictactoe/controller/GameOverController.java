package org.tictactoe.tictactoe.controller;

import javafx.scene.control.Alert;
import javafx.scene.control.ButtonType;
import org.tictactoe.tictactoe.view.View;

import java.util.Optional;

public class GameOverController {
    private View view;

    // Method to show the dialog - this is called when the button is clicked
    public void showDialog(View view) {
        this.view = view;

        // Create an alert dialog of type CONFIRMATION to allow Yes/No options
        Alert alert = new Alert(Alert.AlertType.CONFIRMATION);

        // Set the title, header, and content for the dialog
        alert.setTitle("Oops!");
        alert.setHeaderText("Game Over!!");
        alert.setContentText("Would you like to Try Again or Quit?");

        // Add custom buttons: "Yes" for retrying, and "Quit" for exiting
        ButtonType yesButton = new ButtonType("Yes");
        ButtonType quitButton = new ButtonType("Quit");

        // Clear default buttons and set custom ones
        alert.getButtonTypes().setAll(yesButton, quitButton);

        // Show the dialog and wait for user response
        Optional<ButtonType> result = alert.showAndWait();

        // Handle the user's choice
        if (result.isPresent()) {
            if (result.get() == yesButton) {
                System.out.println("User chose to Try Again!");
                //TODO : Alteranete showing a new instance versus showing the currently running instance.
                view.showGameBoardScene();
            } else if (result.get() == quitButton) {
                System.out.println("User chose to Quit the game!");
                //TODO : Destroy old instance of the gameboard scene
                //TODO: show current instance of the home scene
                view.showHomeScene();
            }
        }
    }
}
