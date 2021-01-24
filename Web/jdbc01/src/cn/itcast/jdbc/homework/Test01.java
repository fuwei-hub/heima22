package cn.itcast.jdbc.homework;

import cn.itcast.utils.JdbcUtils;
import org.junit.Test;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Test01 {
    @Test
    public void add() throws Exception {
        Connection connection = JdbcUtils.getConnection();
        PreparedStatement preparedStatement = connection.prepareStatement("insert into department values(?,?)");
        preparedStatement.setObject(1, 6);
        preparedStatement.setObject(2, "营销部");
        int i = preparedStatement.executeUpdate();
        System.out.println("共" + i + "受到影响");
        JdbcUtils.close(connection, preparedStatement, null);
    }

    @Test
    public void delete() throws Exception {
        Connection connection = JdbcUtils.getConnection();
        PreparedStatement preparedStatement = connection.prepareStatement("delete from department where dept_name=?");
        preparedStatement.setObject(1, "营销部");
        int i = preparedStatement.executeUpdate();
        System.out.println("共" + i + "受到影响");
        JdbcUtils.close(connection, preparedStatement, null);
    }

    @Test
    public void update() throws Exception {
        Connection connection = JdbcUtils.getConnection();
        PreparedStatement preparedStatement = connection.prepareStatement("update department set dept_name=? where dept_id=?");
        preparedStatement.setObject(1, "营销部");
        preparedStatement.setObject(2, 3);
        int i = preparedStatement.executeUpdate();
        System.out.println("共" + i + "受到影响");
        JdbcUtils.close(connection, preparedStatement, null);
    }

    @Test
    public void query()throws Exception{
        Connection connection = JdbcUtils.getConnection();
        PreparedStatement preparedStatement = connection.prepareStatement("select * from department");
        ResultSet resultSet = preparedStatement.executeQuery();
        while(resultSet.next()){
            Object dept_id = resultSet.getObject("dept_id");
            Object dept_name = resultSet.getObject("dept_name");
            System.out.println(dept_id+","+dept_name);
        }
        JdbcUtils.close(connection,preparedStatement,resultSet);
    }
}
