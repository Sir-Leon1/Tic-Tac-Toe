package org.tictactoe.tictactoe.controller;

import javafx.stage.Stage;
import org.tictactoe.tictactoe.view.LoginForm;

public class LoginController {
    private final Stage stage;
    private final LoginForm loginView;
    private RegisterController registrationController;

    public LoginController(Stage stage) {
        this.stage = stage;
        this.loginView = new LoginForm(stage, this);
    }

    public void start() {
        loginView.show();
    }

    public void setRegistrationController(RegisterController registrationController) {
        this.registrationController = registrationController;
    }

    public void handleLogin(String username, String password) {

        if (username.isEmpty() || password.isEmpty()) {
            System.err.println("Username and password must not be empty.");
        } else {
            System.out.println("Login successful for user: " + username);
        }
    }

    public void showRegistrationScreen() {
        if (registrationController != null) {
            registrationController.start();
        }
    }
}
