package ua.lviv.iot.model.persistant;

import lombok.NoArgsConstructor;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

@NoArgsConstructor
public class ConnectionDB {
    private static final String URL = "jdbc:mysql://localhost:3306/patients_data?allowPublicKeyRetrieval=true&" +
            "createDatabaseIfNotExist=true&useSSL=false&serverTimezone=UTC";
    private static String USER = "root";
    private static String PASSWORD = "01012015";
    private static Connection connection = null;

    public static Connection getConnection() {
        if (connection == null) {
            try {
                connection = DriverManager.getConnection(URL, USER, PASSWORD);
            } catch (SQLException e) {
                System.out.println("SQLException: " + e.getMessage());
            }
        }
        return connection;
    }
}
