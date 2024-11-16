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

        // Adding profile image
        Image image = new Image(getClass().getResource("/profile.png").toExternalForm());
        ImageView profileView = new ImageView(image);
        profileView.getStyleClass().add("profile-image");
        profileView.setFitHeight(100);
        profileView.setFitWidth(100);

        //Username Label
        Label username = new Label("Username: ");
        username.getStyleClass().add("username");
        //friends Label
        Label friends = new Label("Friends: ");
        friends.getStyleClass().add("username");

        Separator separator = new Separator();
        separator.getStyleClass().add("custom-separator");
        separator.setPrefWidth(Double.MAX_VALUE);

        //NewGame Button
        Button button = new Button("New Game");
        button.getStyleClass().add("custom-button");
        button.setOnAction(e -> {
            System.out.println("Hello, World!");
        });

        //High score Label
        Label highScore = new Label("HighScore: ");
        highScore.getStyleClass().add("high-score");


        //Reset Button
        Button resetButton = new Button("Reset");
        resetButton.getStyleClass().add("custom-button");

        //Log Out Button
        Button logOutButton = new Button("LogOut");
        logOutButton.getStyleClass().add("custom-button");


        root.add(profileView, 0, 0, 2, 2);
        root.add(username, 2, 0);
        root.add(friends, 2, 1);
        root.add(separator,0,2, 4,1);
        root.add(button, 0,3);
        root.add(highScore, 0,4);
        root.add(resetButton, 0,5);
        root.add(logOutButton, 0, 6);

        return root;
    }
}