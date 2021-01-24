package cn.itcast.DruidDemo;

import com.alibaba.druid.pool.DruidDataSourceFactory;

import javax.sql.DataSource;
import java.util.Properties;

public class Test {
    public static void main(String[] args) throws Exception {
        Properties properties = new Properties();
        properties.load(Test.class.getClassLoader().getResourceAsStream("druid.properties"));
        DataSource dataSource = DruidDataSourceFactory.createDataSource(properties);
        for (int i = 0; i < 15; i++) {
            System.out.println(dataSource.getConnection());
        }
    }
}
