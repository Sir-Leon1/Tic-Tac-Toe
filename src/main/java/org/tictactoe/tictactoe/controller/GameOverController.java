package org.tictactoe.tictactoe.controller;

import javafx.scene.control.Alert;

//Let us now control what happens when the user interacts with our app
public class GameOverController {

        // Method to show the dialog - this is called when the button is clicked
        public void showDialog() {
            // Create an alert dialog of type INFORMATION
            Alert alert = new Alert(Alert.AlertType.INFORMATION);

            // Set the title, header, and content for the dialog
            alert.setTitle("Oops!");
            alert.setHeaderText("Game Over!!");
            alert.setContentText("Would you wish to Try Again?");

            // Show the dialog and wait for user response
            alert.showAndWait();
        }

}
