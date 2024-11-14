package org.tictactoe.tictactoe.view;

import javafx.geometry.Insets;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.Separator;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;

public class GameView {

    public GridPane getContent() {
        GridPane root = new GridPane();
        root.setVgap(10);
        root.setHgap(10);
        root.setPadding(new Insets(10, 10, 10, 10));
        root.getStyleClass().add("grid-pane");
        //root.setStyle("-fx-background-color: dark #d4dc05;");
        // Ensure the image file is located at src/main/resources/images/example.png
        Image image = new Image(getClass().getResource("/profile.png").toExternalForm());
        ImageView profileView = new ImageView(image);
        //root.getChildren().add(imageView);
        profileView.getStyleClass().add("profile-image");
        profileView.setFitHeight(100);
        profileView.setFitWidth(100);

        Separator separator = new Separator();
        separator.setPrefWidth(800);

        Button button = new Button("New Game");
        button.getStyleClass().add("custom-button");
        button.setOnAction(e -> {
            System.out.println("Hello, World!");
        });

        //Username Label
        Label username = new Label("Username: ");
        username.getStyleClass().add("username");
        //friends Label
        Label friends = new Label("Friends: ");
        friends.getStyleClass().add("username");
        root.add(profileView, 0, 0, 2, 2);
        root.add(username, 2, 0);
        root.add(friends, 2, 1);
        root.add(separator,3,1, 3,3);
        root.add(button, 3,1);

        return root;
    }
}