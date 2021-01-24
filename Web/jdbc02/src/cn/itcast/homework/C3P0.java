package cn.itcast.homework;

import com.mchange.v2.c3p0.ComboPooledDataSource;
import org.junit.Test;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class C3P0 {
    public static void main(String[] args) throws Exception {
        //1.导入jar包
        //2.创建一个无参的C3P0连接池
        ComboPooledDataSource dataSource = new ComboPooledDataSource();
        //3.创建连接
        for (int i = 1; i < 12; i++) {
            Connection connection = dataSource.getConnection();
            System.out.println("第"+i+"个连接");
            System.out.println(connection);
            if(i==5){
                connection.close();
            }
        }
    }

    @Test
    public void otherC3P0() throws Exception{
        ComboPooledDataSource dataSource = new ComboPooledDataSource("otherC3P0");
        Connection connection = dataSource.getConnection();
        PreparedStatement preparedStatement = connection.prepareStatement("select * from department");
        ResultSet resultSet = preparedStatement.executeQuery();
        while(resultSet.next()){
            Object dept_id = resultSet.getObject("dept_id");
            Object dept_name = resultSet.getObject("dept_name");
            System.out.println(dept_id+","+dept_name);
        }
        resultSet.close();
        preparedStatement.close();
        connection.close();
    }
}
