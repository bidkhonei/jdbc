package service;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBHelper {

    private static String serverAddress = "127.0.0.1:5432";
    private static String DBName = "users";
    private static String clinetName = "postgers";
    private static String password = "22799";


    private Connection connection;

    public Connection connect() {
        try {
            Class.forName("org.postgresql.Driver");

        } catch (ClassNotFoundException e) {
            System.err.println("Where is your JDBC Postgresql Driver??" + "include Your library patch!");
            e.printStackTrace();
        }

        try {
            connection = DriverManager.getConnection("jdbc:postgresql://" + serverAddress + "/" + DBName, clinetName, password);
            return connection;
        } catch (SQLException e) {
            System.err.println("connection Filed check out put console");
            e.printStackTrace();
        }


        return null;
    }

}
