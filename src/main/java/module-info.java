module org.tictactoe.tictactoe {
    requires javafx.controls;
    requires javafx.fxml;


    opens org.tictactoe.tictactoe to javafx.fxml;
    exports org.tictactoe.tictactoe;
}