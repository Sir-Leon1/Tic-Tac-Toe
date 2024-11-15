package org.tictactoe.tictactoe;

import javafx.application.Application;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;


import org.tictactoe.tictactoe.controller.GameOverController;
import org.tictactoe.tictactoe.controller.GameWonController;
import org.tictactoe.tictactoe.view.GameOverView;
import org.tictactoe.tictactoe.view.GameWonView;

import javafx.scene.Scene;
import javafx.scene.layout.VBox;


// This is the Main Application class - it starts everything
public class TicTacToeApp extends Application {
    @Override
    public void start(Stage primaryStage) {

        // Create instances of the view classes
        GameWonView view1 = new GameWonView();
        GameOverView view2 = new GameOverView();

        // Get the panes from the view classes
        VBox view1Pane = view1.getView();
        HBox view2Pane = view2.getView();

        // Combine them in a single layout
        VBox mainLayout = new VBox(20); // Vertical layout with spacing
        mainLayout.getChildren().addAll(view1Pane, view2Pane);

        // Set up the scene and stage
        Scene scene = new Scene(mainLayout, 400, 300);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Home");
        primaryStage.show();


    }

    public static void main(String[] args) {
        // Launch the JavaFX application
        launch(args);
    }
} 