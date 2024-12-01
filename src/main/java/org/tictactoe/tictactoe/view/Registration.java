package org.tictactoe.tictactoe.view;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import org.tictactoe.tictactoe.controller.RegisterController;

public class Registration {

    private Stage stage;
    private RegisterController controller;
    private TextField firstNameField;
    private TextField secondNameField;
    private TextField emailField;
    private TextField userNameField;
    private PasswordField passwordField;
    private Button registerButton;
    private View view;

    public Registration(View view) {
        this.view = view;
        this.stage = stage;
        this.controller = new RegisterController(view);

        // Initialize form fields
        firstNameField = new TextField();
        firstNameField.setPromptText("First Name");
        firstNameField.getStyleClass().add("text");

        secondNameField = new TextField();
        secondNameField.setPromptText("Second Name");
        secondNameField.getStyleClass().add("text");

        emailField = new TextField();
        emailField.setPromptText("Email");
        emailField.getStyleClass().add("text");

        userNameField = new TextField();
        userNameField.setPromptText("UserName");
        userNameField.getStyleClass().add("text");

        passwordField = new PasswordField();
        passwordField.setPromptText("Password");
        passwordField.getStyleClass().add("username");

        registerButton = new Button("Register");
        registerButton.getStyleClass().add("custom-button");

    //to make the registration button have the same width wi the fields
        registerButton.prefWidthProperty().bind(firstNameField.widthProperty());


        // Set action for the register button
        registerButton.setOnAction(event -> {
            String firstName = firstNameField.getText();
            String secondName = secondNameField.getText();
            String email = emailField.getText();
            String userName = userNameField.getText();
            String password = passwordField.getText();

            controller.handleRegistration(firstName, secondName, email, userName, password);
        });
    }


    public void show() {
        stage.setScene(new Scene(createRegistration(), 800, 600));

        String css = getClass().getResource("/css/styles.css").toExternalForm();
        stage.setTitle("Tic Tac Toe - Registration");
        stage.show();
    }

    Parent createRegistration() {
        // Create an image view
        ImageView imageView = new ImageView();
        try {
            imageView.setImage(new Image(getClass().getResource("/image/tictac.jpeg").toExternalForm()));
            imageView.setFitHeight(650);
            imageView.setFitWidth(550);
            imageView.setPreserveRatio(false);
            imageView.setMouseTransparent(true); // Prevent the image from blocking events
        } catch (NullPointerException e) {
            System.err.println("Image not found: " + e.getMessage());
        }

        // Labels with explicit styles
        Label usernameLabel = new Label("Username:");
        usernameLabel.setStyle("-fx-text-fill: white;");
        Label passwordLabel = new Label("Password:");
        passwordLabel.setStyle("-fx-text-fill: white;");


        // Create VBox for form fields
        VBox formLayout = new VBox(15);
        formLayout.setAlignment(Pos.CENTER_LEFT);
        formLayout.setPadding(new Insets(20));
        formLayout.getChildren().addAll(
                new Label("First Name:"), firstNameField,
                new Label("Second Name:"), secondNameField,
                new Label("Email:"), emailField,
                new Label("UserName:"),userNameField,
                new Label("Password:"), passwordField,
                registerButton
        );

        // Create HBox for main layout
        HBox mainLayout = new HBox(50);
        mainLayout.getStyleClass().add("layout");
        mainLayout.setPadding(new Insets(10));
        mainLayout.setAlignment(Pos.CENTER);
        mainLayout.getChildren().addAll(imageView, formLayout);

        return mainLayout;
    }
}
