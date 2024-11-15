package org.tictactoe.tictactoe.view;


import org.tictactoe.tictactoe.controller.GameWonController;

import javafx.scene.layout.VBox;
import javafx.scene.control.*;//eg. buttons and labels

//setting up what the user will see
public class GameWonView {
    private GameWonController controller;
    private Button showPopButton;

    public GameWonView(){
        controller = new GameWonController();
    }

        public VBox getView() {
            VBox vbox = new VBox();

            vbox.setSpacing(10); // Add some spacing between widgets

            // Initialize the button and set its text
            showPopButton = new Button("Show GameWonPopUp");
            // Set the action for the button to call the controller's method
            showPopButton.setOnAction(e -> controller.showDialog());

            vbox.getChildren().add(showPopButton);
            return vbox;
        }

}
