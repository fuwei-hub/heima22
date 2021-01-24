package cn.itcast.jdbc.homework;

import java.sql.*;
import java.util.ResourceBundle;

public class JdbcUtils {
    private static String driver;
    private static String url;
    private static String username;
    private static String password;
    //静态代码块给静态成员变量赋值
    static {
        try {
            ResourceBundle jdbc = ResourceBundle.getBundle("jdbc");
            driver = jdbc.getString("driver");
            url = jdbc.getString("url");
            username = jdbc.getString("username");
            password = jdbc.getString("password");
            Class.forName(driver);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
    public static Connection getConnection() throws Exception {
        Connection connection = DriverManager.getConnection(driver,username,password);
        return connection;
    }

    public static void close(ResultSet resultSet, Statement statement,Connection connection){
        try {
            resultSet.close();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        try {
            statement.close();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        try {
            connection.close();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }
}
