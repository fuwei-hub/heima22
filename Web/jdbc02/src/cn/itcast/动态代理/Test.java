package cn.itcast.动态代理;

import java.sql.Connection;
import java.sql.SQLException;

public class Test {
    public static void main(String[] args) {
        MyDataSource myDataSource = new MyDataSource();
        for (int i = 0; i < 15; i++) {
            try {
                Connection connection = myDataSource.getConnection();
                connection.close();
                System.out.println(connection);
                System.out.println("还剩余"+myDataSource.getSize());
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
        }
    }
}
