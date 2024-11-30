package org.tictactoe.tictactoe.model;

import java.util.List;

public class TestDBConnection {
    public static void main(String[] args) {
    PlayerDAO playerDAO = new PlayerDAO();
    List<User> users = playerDAO.getAllUsers();

    for (User user : users) {
        System.out.println("Name: " + user.getUsername());
        System.out.println("Email: " + user.getEmail());
        System.out.println("Password: " + user.getPassword());
        System.out.println("Highscore: " + user.getHighscore());
        System.out.println("---------------------------");
    }
}
}
