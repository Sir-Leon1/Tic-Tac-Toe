package org.tictactoe.tictactoe.controller;

import javafx.scene.control.Alert;
import javafx.scene.control.ButtonType;
import java.util.Optional;

public class GameWonController {

    // Method to show the dialog - this is called when the player wins
    public void showDialog() {
        // Create an alert dialog of type CONFIRMATION to allow user options
        Alert alert = new Alert(Alert.AlertType.CONFIRMATION);

        // Set the title, header, and content for the dialog
        alert.setTitle("Congratulations!");
        alert.setHeaderText("You Won!");
        alert.setContentText("Would you like to Play Again or Quit?");

        // Add custom buttons: "Play Again" and "Quit"
        ButtonType playAgainButton = new ButtonType("Play Again");
        ButtonType quitButton = new ButtonType("Quit");

        // Clear default buttons and set custom ones
        alert.getButtonTypes().setAll(playAgainButton, quitButton);

        // Show the dialog and wait for user response
        Optional<ButtonType> result = alert.showAndWait();

        // Handle the user's choice
        if (result.isPresent()) {
            if (result.get() == playAgainButton) {
                System.out.println("User chose to Play Again!");
                // Logic to restart the game can go here
            } else if (result.get() == quitButton) {
                System.out.println("User chose to Quit the game!");
                // Logic for quitting the application
                System.exit(0); // Exit the app
            }
        }
    }
}
