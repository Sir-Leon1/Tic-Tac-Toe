module org.tictactoe.tictactoe {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.desktop;
    requires  java.sql;


    opens org.tictactoe.tictactoe to javafx.fxml;
    exports org.tictactoe.tictactoe;
}