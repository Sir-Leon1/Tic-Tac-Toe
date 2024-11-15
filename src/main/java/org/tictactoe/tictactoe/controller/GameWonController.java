package org.tictactoe.tictactoe.controller;

import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;

//Let us now control what happens when the user interacts with our app
public class GameWonController {

        // Method to show the dialog - this is called when the button is clicked
        public void showDialog() {
            // Create an alert dialog of type INFORMATION
            Alert alert = new Alert(AlertType.INFORMATION);

            // Set the title, header, and content for the dialog
            alert.setTitle("Great!");
            alert.setHeaderText("You've won the Game!!");
            alert.setContentText("Would you wish to proceed?");

            // Show the dialog and wait for user response
            alert.showAndWait();
        }

}
