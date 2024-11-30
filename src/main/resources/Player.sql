CREATE DATABASE tictactoe IF NOT EXISTS;

       CREATE TABLE users IF NOT EXISTS(
            id INT AUTO_INCREMENT PRIMARY KEY;
            firstname VARCHAR(30) NOT NULL;
            lastname VARCHAR(30) NOT NULL;
            email VARCHAR(50) UNIQUE NOT NULL;
            username VARCHAR(30) UNIQUE NOT NULL;
            highScore INT NOT NULL DEFAULT 0;
            password VARCHAR(30) NOT NULL;

       )