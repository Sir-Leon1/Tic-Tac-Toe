package org.tictactoe.tictactoe.controller;

import javafx.stage.Stage;
import org.tictactoe.tictactoe.view.LoginForm;
import org.tictactoe.tictactoe.view.View;

public class LoginController {
    private LoginForm loginForm;
    private View view;

    // Constructor
    public LoginController(View view) {
        this.view = view;
    }

    public void handleLogin(String username, String password) {
        view.showHomeScene();
        System.out.println("Logged in with username: " + username + " and password: " + password);
    }
}
