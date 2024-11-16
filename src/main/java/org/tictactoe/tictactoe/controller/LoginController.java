package org.tictactoe.tictactoe.controller;

import javafx.stage.Stage;
import org.tictactoe.tictactoe.view.LoginForm;

public class LoginController {
    private Stage stage;
    private LoginForm loginForm;

    // Constructor
    public LoginController(Stage stage) {
        this.stage = stage;

        this.loginForm = new LoginForm(stage, this);
    }

    public void start() {

        if (loginForm != null) {
            loginForm.show();
        } else {
            System.out.println("Login form is not initialized.");
        }
    }

    public void handleLogin(String username, String password) {

        System.out.println("Logged in with username: " + username + " and password: " + password);
    }
}
