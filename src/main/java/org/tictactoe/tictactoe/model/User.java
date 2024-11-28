package org.tictactoe.tictactoe.model;

public class User {
    private String username;
    private String email;
    private String password;
    private int highscore;

    // Constructor
    public User(String username, String email, String password, int highscore) {
        this.username = username;
        this.email = email;
        this.password = password;
        this.highscore = highscore;
    }

    // Default Constructor
    public User() {}

    // Getter for username
    public String getUsername() {
        return username;
    }

    // Setter for username
    public void setUsername(String username) {
        this.username = username;
    }

    // Getter for email
    public String getEmail() {
        return email;
    }

    // Setter for email
    public void setEmail(String email) {
        this.email = email;
    }

    // Getter for password
    public String getPassword() {
        return password;
    }

    // Setter for password
    public void setPassword(String password) {
        this.password = password;
    }


    // Getter for highscore
    public int getHighscore() {
        return highscore;
    }

    // Setter for highscore
    public void setHighscore(int highscore) {
        this.highscore = highscore;
    }


    @Override
    public String toString() {
        return "User{" +
                "username='" + username + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}

