package cn.itcast.C3P0;

import com.mchange.v2.c3p0.ComboPooledDataSource;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Test {
    public static void main(String[] args) throws Exception {
        ComboPooledDataSource dataSource = new ComboPooledDataSource();
        Connection connection = dataSource.getConnection();
        System.out.println(connection);
        PreparedStatement preparedStatement = connection.prepareStatement("select * from department ");
        ResultSet resultSet = preparedStatement.executeQuery();
        while(resultSet.next()){
            Object dept_id = resultSet.getObject("dept_id");
            Object dept_name = resultSet.getObject("dept_name");
            System.out.println(dept_id+","+dept_name);
        }
        resultSet.close();
        preparedStatement.close();
        connection.close();
        dataSource.close();

    }
}
