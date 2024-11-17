package org.tictactoe.tictactoe.controller;

import javafx.stage.Stage;
import org.tictactoe.tictactoe.view.LoginForm;
import org.tictactoe.tictactoe.view.Registration;

public class LoginController {
    private final Stage stage;
    private final LoginForm loginForm;
    private Registration registrationView;

    public LoginController(Stage stage) {
        this.stage = stage;
        this.loginForm = new LoginForm(stage, this);
    }

    public void start() {
        if (loginForm != null) {
            loginForm.show();
        } else {
            System.err.println("Error: Login form is not initialized.");
        }
    }

    public void handleLogin(String username, String password) {
        if (username == null || username.isEmpty() || password == null || password.isEmpty()) {
            System.err.println("Error: Username and password must not be empty.");
            return;
        }

        System.out.println("Logged in with username: " + username);
    }

    public void setRegistrationController(RegisterController registrationController) {
        if (registrationController != null) {
            this.registrationView = new Registration(stage, registrationController);
            System.out.println("Registration controller linked successfully.");
        } else {
            System.err.println("Error: Registration controller is null.");
        }
    }

    public void handleRegister() {
        if (registrationView != null) {
            registrationView.show();
        } else {
            System.err.println("Error: Registration view is not initialized.");
        }
    }
}
