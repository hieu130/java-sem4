package fpt.aptech.t2009m1.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionHelper {

        private static final String DATABASE_URL = "jdbc:mysql://localhost:3306/product";
        private static final String DATABASE_USERNAME = "root";
        private static final String DATABASE_PASSWORD = "";

        private static Connection connection; // Class varible

        public static Connection getConnection() {
            try {
                if (connection == null || connection.isClosed()) {
                    connection = DriverManager.getConnection(DATABASE_URL,DATABASE_USERNAME,DATABASE_PASSWORD);
                    System.out.printf("Connection success");
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
            return connection;
        }
    }
