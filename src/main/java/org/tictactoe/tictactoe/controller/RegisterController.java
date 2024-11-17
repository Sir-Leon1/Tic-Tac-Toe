package org.tictactoe.tictactoe.controller;

import javafx.stage.Stage;
import org.tictactoe.tictactoe.view.Registration;

public class RegisterController {
    private final Stage stage;
    private final Registration registrationView;

    // Constructor
    public RegisterController(Stage stage) {
        this.stage = stage;
        this.registrationView = new Registration(stage, this);
    }

    // Start the registration form
    public void start() {
        if (registrationView != null) {
            registrationView.show();
        } else {
            System.err.println("Registration form is not initialized.");
        }
    }

    // Handle registration logic
    public void handleRegistration(String firstName, String secondName, String email, String password) {
        if (firstName == null || firstName.isEmpty() ||
                secondName == null || secondName.isEmpty() ||
                email == null || email.isEmpty() ||
                password == null || password.isEmpty()) {

            System.err.println("All fields must be filled.");
            return;
        }

        // Simulate successful registration
        System.out.println("Registered with: First Name = " + firstName
                + ", Last Name = " + secondName
                + ", Email = " + email
                + ", Password = " + password);
    }
}
