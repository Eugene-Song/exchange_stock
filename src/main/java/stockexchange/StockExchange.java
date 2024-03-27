package stockexchange;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class StockExchange {
    // JDBC URL, username and password of MySQL server
    private static final String URL = "jdbc:mysql://vcm-39657.vm.duke.edu:3306/MYDB";
    private static final String USER = "ssq";
    private static final String PASSWORD = "12345678";

    // JDBC variables for opening and managing connection
    private static Connection connection;

    public static void main(String[] args) {
        StockExchange stockExchange = new StockExchange();
        stockExchange.start();
    }

    public void start() {
        try {
            // Establishing a connection
            connection = DriverManager.getConnection(URL, USER, PASSWORD);
            System.out.println("Connected to the MySQL server successfully.");

            // Perform operations with the connection here
            // ...
        } catch (SQLException e) {
            System.out.println("SQL Exception: " + e.getMessage());
            e.printStackTrace();
        } finally {
            try {
                if (connection != null && !connection.isClosed()) {
                    connection.close();
                }
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        }
    }

    // Additional methods to interact with the database
    // ...
}
