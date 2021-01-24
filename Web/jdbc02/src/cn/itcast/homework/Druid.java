package cn.itcast.homework;

import com.alibaba.druid.pool.DruidDataSourceFactory;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.Properties;

//Druid不会自动读取配置文件，所以需要手动读取
public class Druid {
    public static void main(String[] args) throws Exception {
        /*读取配置文件*/
        Properties properties = new Properties();
        properties.load(Druid.class.getClassLoader().getResourceAsStream("druid.properties"));
        DataSource dataSource = DruidDataSourceFactory.createDataSource(properties);
        //创建连接
        Connection connection = dataSource.getConnection();
        PreparedStatement preparedStatement = connection.prepareStatement("update department set dept_name=? where dept_id=?");
        preparedStatement.setObject(1,"营销部");
        preparedStatement.setObject(2,5);
        int i = preparedStatement.executeUpdate();
        System.out.println("共"+i+"行受到影响");
        preparedStatement.close();
        connection.close();
    }
}
