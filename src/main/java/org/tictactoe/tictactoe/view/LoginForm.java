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
    private Button RegisterButton;
    private LoginController loginController;
    private View view;

    // Constructor
    public LoginForm(View view) {
        this.view = view;
        loginController = new LoginController(view);

        // Initialize
        usernameField = new TextField();
        passwordField = new PasswordField();
        loginButton = new Button("Login");
        RegisterButton = new Button("Register");

        // Set up the login button action
        loginButton.setOnAction(event -> {
            String username = usernameField.getText();
            String password = passwordField.getText();
            loginController.handleLogin(username, password);
        });
        RegisterButton.setOnAction(event -> {
            view.showRegistrationScene();
        });
    }

    public HBox createLoginForm() {
        // Load the image
        ImageView imageView = new ImageView();
        try {
            imageView.setImage(new Image(getClass().getResource("/image/tictac.jpeg").toExternalForm()));
            imageView.setFitHeight(650);
            imageView.setFitWidth(550);
            imageView.setPreserveRatio(false);
        } catch (NullPointerException e) {
            System.err.println("Image not found: " + e.getMessage());
        }

        // Create VBox for form fields
        VBox formLayout = new VBox(15);
        formLayout.setAlignment(Pos.CENTER_LEFT);
        formLayout.setPadding(new Insets(20));
        formLayout.getChildren().addAll(
                new Label("Username:"), usernameField,
                new Label("Password:"), passwordField,
                loginButton, RegisterButton
        );

        // Create HBox for main layout
        HBox mainLayout = new HBox(30);
        mainLayout.getStyleClass().add("layout");
        mainLayout.setPadding(new Insets(20));
        mainLayout.setAlignment(Pos.CENTER);
        mainLayout.getChildren().addAll(imageView, formLayout);

        return mainLayout;
    }
}
