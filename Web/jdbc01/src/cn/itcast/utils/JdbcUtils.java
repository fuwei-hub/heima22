package cn.itcast.utils;

import java.sql.*;
import java.util.ResourceBundle;

/**
 * 2个功能
 *  1.获取连接
 *  2.释放资源
 */
public class JdbcUtils {

    /*1.定义静态成员变量，通过静态代码块读取配置文件，然后给静态成员变量赋值*/
    private static String driver;
    private static String url;
    private static String username;
    private static String password;

    static {
        try {
            ResourceBundle bundle = ResourceBundle.getBundle("jdbc");
            driver = bundle.getString("driver");
            url = bundle.getString("url");
            username = bundle.getString("username");
            password = bundle.getString("password");

            Class.forName(driver);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }


    /**
     * 获取连接
     * 返回值 Connection
     * 形参 不需要
     */
    public static Connection getConnection()throws Exception{
        Connection connection = DriverManager.getConnection(url, username, password);
        return connection;
    }


    /**
     * 释放资源
     * 返回值 不需要
     * 参数 Connection, Statement,ResultSet
     */
    public static void close(Connection connection, Statement statement, ResultSet resultSet){
        try {
            if(resultSet!=null){
                resultSet.close();
            }

        } catch (Exception throwables) {
            throwables.printStackTrace();
        }
        try {
            if(statement!=null){
                statement.close();
            }

        } catch (Exception throwables) {
            throwables.printStackTrace();
        }
        try {
            if(connection!=null){
                connection.close();
            }

        } catch (Exception throwables) {
            throwables.printStackTrace();
        }
    }

    public static void main(String[] args) {
        JdbcUtils.close(null,null,null);
    }

}
