package org.tictactoe.tictactoe.model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class PlayerDAO {

    private Connection connect;

    public PlayerDAO() {
        this.connect = Model.getInstance().getDatabaseDriver().connect();
    }

    // Method to save a new user to the database during registration
    public boolean saveUser(User user) {
        String query = "INSERT INTO Users (name, email, password, highscore) VALUES (?, ?, ?, ?)";

        try (Connection conn = connect;

             PreparedStatement stmt = conn.prepareStatement(query)) {

            stmt.setString(1, user.getUsername());
            stmt.setString(2, user.getEmail());
            stmt.setString(3, user.getPassword());
            stmt.setInt(4, user.getHighscore());

            int rowsInserted = stmt.executeUpdate();
            return rowsInserted > 0;

        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    // Method to retrieve a user by email
    public User getUserByEmail(String email) {
        String query = "SELECT * FROM Users WHERE email = ?";

        try (Connection conn = connect;
             PreparedStatement stmt = conn.prepareStatement(query)) {

            stmt.setString(1, email);
            ResultSet rs = stmt.executeQuery();

            if (rs.next()) {
                User user = new User();
                user.setUsername(rs.getString("name"));
                user.setEmail(rs.getString("email"));
                user.setPassword(rs.getString("password"));
                user.setHighscore(rs.getInt("highscore"));
                return user;
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    // Method to retrieve all users
    public List<User> getAllUsers() {
        List<User> users = new ArrayList<>();
        String query = "SELECT * FROM users";

        try (Connection conn = connect;
             PreparedStatement stmt = conn.prepareStatement(query);
             ResultSet rs = stmt.executeQuery()) {

            while (rs.next()) {
                User user = new User();
                user.setUsername(rs.getString("firstname"));
                user.setEmail(rs.getString("email"));
                user.setPassword(rs.getString("password"));
                user.setHighscore(rs.getInt("highScore"));
                users.add(user);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        return users;
    }
    //TODO : Method to update player score after a win
    //TODO : Method to reset a players score to 0
    //TODO : Method to retrieve all users
}

