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

    // Constructor
    public LoginForm(Stage stage, LoginController controller) {
        this.stage = stage;
        this.controller = controller;

        // Initialize fields
        usernameField = new TextField();
        usernameField.setPromptText("Enter your username");
        passwordField = new PasswordField();
        passwordField.setPromptText("Enter your password");
        loginButton = new Button("Login");
        switchToRegisterButton = new Button("Switch to Register");

        // Set login button action
        loginButton.setOnAction(event -> {
            String username = usernameField.getText();
            String password = passwordField.getText();
            controller.handleLogin(username, password);
        });

        // Set action for the switch to register button
        switchToRegisterButton.setOnAction(event -> controller.showRegistrationScreen());
    }

    public void show() {
        stage.setScene(new Scene(createLoginForm(), 800, 600));
        stage.setTitle("Tic Tac Toe - Login");
        stage.show();
    }

    public HBox createLoginForm() {
        // Load the image
        ImageView imageView = new ImageView();
        try {
            imageView.setImage(new Image(getClass().getResource("/image/tictac.jpeg").toExternalForm()));
            imageView.setFitHeight(300);
            imageView.setFitWidth(300);
            imageView.setPreserveRatio(true);
        } catch (NullPointerException e) {
            System.err.println("Image not found: " + e.getMessage());
        }

        // Create VBox
        VBox formLayout = new VBox(15);
        formLayout.setAlignment(Pos.CENTER_LEFT);
        formLayout.setPadding(new Insets(20));
        formLayout.getChildren().addAll(
                new Label("Username:"), usernameField,
                new Label("Password:"), passwordField,
                loginButton, switchToRegisterButton
        );

        // Create HBox for main layout
        HBox mainLayout = new HBox(30);
        mainLayout.setPadding(new Insets(20));
        mainLayout.setAlignment(Pos.CENTER);
        mainLayout.getChildren().addAll(imageView, formLayout);

        return mainLayout;
    }
}
