package org.tictactoe.tictactoe.model;

//Singleton approach
public class Model {
    private static Model model;
    private static DatabaseDriver databaseDriver;

    public Model() {
        databaseDriver = new DatabaseDriver();
    }

    public static Model getInstance() {
        if(model == null) {
            model = new Model();
        }
        return model;
    }

    public DatabaseDriver getDatabaseDriver() {
        return databaseDriver;
    }
}