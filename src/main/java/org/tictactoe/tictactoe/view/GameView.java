package org.tictactoe.tictactoe.view;

import javafx.geometry.Insets;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.Separator;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;
import org.tictactoe.tictactoe.controller.GameViewController;

public class GameView {
    private View view;
    private GameBoard gameBoard;
    private GameViewController gameViewController;
    private Button newGameButton, resetButton, logOutButton;
    //TODO : variable to hold current players information

    public GameView(View view) {
        this.view = view;
        this.gameBoard = new GameBoard();
        this.newGameButton = createNewGameButton();
        this.resetButton = createResetButton();
        this.logOutButton = createLogOutButton();
    }

    public GridPane getContent() {
        GridPane root = new GridPane();
        root.setVgap(10);
        root.setHgap(10);
        root.setPadding(new Insets(10, 10, 10, 10));
        root.getStyleClass().add("layout");

        // Adding profile image
        Image image = new Image(getClass().getResource("/profile.png").toExternalForm());
        ImageView profileView = new ImageView(image);
        profileView.getStyleClass().add("profile-image");
        profileView.setFitHeight(100);
        profileView.setFitWidth(100);

        // Username Label
        Label username = new Label("Username: ");
        username.getStyleClass().add("username");

        // Friends Label
        Label friends = new Label("Friends: ");
        friends.getStyleClass().add("username");

        Separator separator = new Separator();
        separator.getStyleClass().add("custom-separator");
        separator.setPrefWidth(Double.MAX_VALUE);

        // High score Label
        Label highScore = new Label("HighScore: ");
        highScore.getStyleClass().add("text");


        root.add(profileView, 0, 0, 2, 2);
        root.add(username, 2, 0);
        root.add(friends, 2, 1);
        root.add(separator, 0, 2, 4, 1);
        root.add(newGameButton, 0, 3);
        root.add(highScore, 0, 4);
        root.add(resetButton, 0, 5);
        root.add(logOutButton, 0, 6);

        return root;
    }

    private Button createNewGameButton() {
        Button button = new Button("New Game");
        button.getStyleClass().add("custom-button");
        return button;
    }
    private Button createResetButton() {
        Button button = new Button("Reset");
        button.getStyleClass().add("custom-button");
        return button;
    }
    private Button createLogOutButton() {
        Button button = new Button("Log Out");
        button.getStyleClass().add("custom-button");
        return button;
    }
    public Button getNewGameButton() {
        return newGameButton;
    }
    public Button getResetButton() {
        return resetButton;
    }

    public Button getLogOutButton() {
        return logOutButton;
    }
    public View getView() {
        return view;
    }
}