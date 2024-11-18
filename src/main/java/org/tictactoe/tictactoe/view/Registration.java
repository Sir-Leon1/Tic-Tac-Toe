package org.tictactoe.tictactoe.view;

import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import org.tictactoe.tictactoe.controller.RegisterController;

public class Registration {
    private Stage stage;
    private RegisterController controller;

    private TextField firstNameField;
    private TextField secondNameField;
    private TextField emailField;
    private PasswordField passwordField;
    private Button registerButton;

    public Registration(Stage stage, RegisterController controller) {
        this.stage = stage;
        this.controller = controller;

        // Initialize fields
        firstNameField = new TextField();
        firstNameField.setPromptText("First Name");

        secondNameField = new TextField();
        secondNameField.setPromptText("Second Name");

        emailField = new TextField();
        emailField.setPromptText("Email");

        passwordField = new PasswordField();
        passwordField.setPromptText("Password");

        registerButton = new Button("Register");

        // Set action for the register button
        registerButton.setOnAction(event -> {
            String firstName = firstNameField.getText();
            String secondName = secondNameField.getText();
            String email = emailField.getText();
            String password = passwordField.getText();

            controller.handleRegistration(firstName, secondName, email, password);
        });
    }

    public void show() {
        stage.setScene(new Scene(createRegistrationForm(), 800, 600));
        stage.setTitle("Tic Tac Toe - Registration");
        stage.show();
    }

    private Parent createRegistrationForm() {
        // Create an image view
        ImageView imageView = new ImageView();
        try {
            Image image = new Image(getClass().getResource("/image/tictac.jpeg").toExternalForm());
            imageView.setImage(image);
            imageView.setFitWidth(200);
            imageView.setPreserveRatio(true);
        } catch (Exception e) {
            System.err.println("Error loading image: " + e.getMessage());
        }

        // Layout the form
        VBox formLayout = new VBox(10);
        formLayout.getChildren().addAll(
                imageView,
                new Text("First Name:"), firstNameField,
                new Text("Second Name:"), secondNameField,
                new Text("Email:"), emailField,
                new Text("Password:"), passwordField,
                registerButton
        );

        // Center the form
        formLayout.setStyle("-fx-alignment: center; -fx-padding: 20;");

        return formLayout;
    }
}
