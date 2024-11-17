package org.tictactoe.tictactoe;

import javafx.application.Application;
import javafx.stage.Stage;
import org.tictactoe.tictactoe.controller.LoginController;
import org.tictactoe.tictactoe.controller.RegisterController;

public class TicTacToeApp extends Application {

    @Override
    public void start(Stage primaryStage) {
        // Create the LoginController
        LoginController loginController = new LoginController(primaryStage);
        RegisterController registrationController = new RegisterController(primaryStage);
        // Start the LoginForm by calling the start method
        loginController.setRegistrationController(registrationController);
        loginController.start();

    }

    public static void main(String[] args) {
        launch();
    }
}
