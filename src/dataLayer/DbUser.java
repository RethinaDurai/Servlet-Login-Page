package dataLayer;

import java.sql.*;

public class DbUser {

    static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
    static final String DB_URL = "jdbc:mysql://localhost/dbs";

    static final String USER = "webappuser";
    static final String PASS = "Test@123";

    public boolean isValidUserLogin(String username, String userPassword) {

        boolean isValidUser = false;

        Connection connection = null;
        Statement statement = null;

        try {
            Class.forName(JDBC_DRIVER);

            System.out.println("Connecting to database...");
            connection = DriverManager.getConnection(DB_URL, USER, PASS);

            System.out.println("Creating statement...");
            statement = connection.createStatement();

            String sql = "SELECT * FROM webapp WHERE username = \"" +
                            username + "\" AND password = \"" + userPassword + "\"";

            System.out.println(sql);

            ResultSet resultSet = statement.executeQuery(sql);

            if (resultSet.next()) {
                isValidUser = true;
            }

            resultSet.close();
            statement.close();
            connection.close();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (statement != null) {
                    statement.close();
                }
            } catch (SQLException ignored) {

            }
            try {
                if (connection != null) {
                    connection.close();
                }
            } catch (SQLException se) {
                se.printStackTrace();
            }
        }

        System.out.println("Closing the connection");

        return isValidUser;
    }
}