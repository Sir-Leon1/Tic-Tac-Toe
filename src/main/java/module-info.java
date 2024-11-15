module org.tictactoe.tictactoe {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.desktop;


    opens org.tictactoe.tictactoe to javafx.fxml;
    exports org.tictactoe.tictactoe;
}