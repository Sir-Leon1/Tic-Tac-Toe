package org.tictactoe.tictactoe.model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class PlayerDAO {
    private final String url = "jdbc:mysql://localhost:3306/GameAppDB";
    private final String user = "root";
    private final String password = "your_password";

    // Method to connect to the database
    private Connection connect() {
        try {
            return DriverManager.getConnection(url, user, password);
        }
        catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    // Method to save a user to the database
    public boolean saveUser(User user) {
        String query = "INSERT INTO Users (name, email, password, highscore) VALUES (?, ?, ?, ?)";

        try (Connection conn = connect();

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

        try (Connection conn = connect();
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
}

