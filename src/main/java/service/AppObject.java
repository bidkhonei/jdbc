package service;

import java.sql.Connection;

public class AppObject {

    public static final String[] inputMenu = {"login", "signin", "exit"};
    public static Connection connection;

    public void getConnection() {
        DBHelper dbHelper = new DBHelper();
        dbHelper.connect();
    }
}
