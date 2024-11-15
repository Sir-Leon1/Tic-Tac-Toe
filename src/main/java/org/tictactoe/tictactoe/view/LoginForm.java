package org.tictactoe.tictactoe.view;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import org.tictactoe.tictactoe.controller.LoginController;

public class LoginForm {
    private Stage stage;
    private LoginController controller;
    private TextField usernameField;
    private PasswordField passwordField;
    private Button loginButton;
    private Button switchToRegisterButton;

    // Constructor initializes the login
    public LoginForm(Stage stage, LoginController controller) {
        this.stage = stage;
        this.controller = controller;

        // Initialize UI components
        usernameField = new TextField();
        passwordField = new PasswordField();
        loginButton = new Button("Login");
        switchToRegisterButton = new Button("Register");

        // Set up the login button action
        loginButton.setOnAction(event -> {
            String username = usernameField.getText();
            String password = passwordField.getText();
            controller.handleLogin(username, password);
        });
    }

    public void show() {
        // Set scene with updated layout
        stage.setScene(new Scene(createLoginForm(), 800, 600)); // Updated scene size
        stage.show();
    }

    public HBox createLoginForm() {
        // Load the image
        ImageView imageView = new ImageView();
        try {
            imageView.setImage(new Image(getClass().getResource("/image/tictac.jpeg").toExternalForm()));
            imageView.setFitHeight(650); // Set height to 500
            imageView.setFitWidth(550);
            imageView.setPreserveRatio(false); // Preserve the aspect ratio for proper scaling
        } catch (NullPointerException e) {
            System.err.println("Image not found: " + e.getMessage());
        }

        // Create VBox for form fields
        VBox formLayout = new VBox(15); // 15px spacing between elements
        formLayout.setAlignment(Pos.CENTER_LEFT);
        formLayout.setPadding(new Insets(20));
        formLayout.getChildren().addAll(
                new Label("Username:"), usernameField,
                new Label("Password:"), passwordField,
                loginButton, switchToRegisterButton
        );

        // Create HBox for main layout
        HBox mainLayout = new HBox(30); // 30px spacing between image and form
        mainLayout.setPadding(new Insets(20));
        mainLayout.setAlignment(Pos.CENTER);
        mainLayout.getChildren().addAll(imageView, formLayout); // Place image on the left and form on the right

        return mainLayout;
    }
}
