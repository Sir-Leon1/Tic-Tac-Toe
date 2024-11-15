package org.tictactoe.tictactoe.controller;

import javafx.stage.Stage;
import org.tictactoe.tictactoe.view.LoginForm;

public class LoginController {
    private Stage stage;
    private LoginForm loginForm;

    // Constructor receives the stage from the Main Application
    public LoginController(Stage stage) {
        this.stage = stage;
        // Initialize the loginForm after passing the stage
        this.loginForm = new LoginForm(stage, this);
    }

    public void start() {
        // Make sure the loginForm is initialized before calling show()
        if (loginForm != null) {
            loginForm.show();
        } else {
            System.out.println("Login form is not initialized.");
        }
    }

    public void handleLogin(String username, String password) {
        // Handle login logic here
        System.out.println("Logged in with username: " + username + " and password: " + password);
    }
}
