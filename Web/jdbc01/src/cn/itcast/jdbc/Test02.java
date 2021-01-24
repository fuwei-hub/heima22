package cn.itcast.jdbc;

import cn.itcast.utils.JdbcUtils;
import org.junit.Test;

import java.sql.Connection;
import java.sql.Statement;

public class Test02 {
    @Test
    public void add()throws  Exception{
        //创建连接
        Connection connection = JdbcUtils.getConnection();
        //创建执行对象
        Statement statement = connection.createStatement();
        //执行操作
        int i = statement.executeUpdate("insert into employee values(null,'伟伟',4,3500)");
        System.out.println("共"+i+"行收到影响");
        JdbcUtils.close(connection,statement,null);

    }
}
