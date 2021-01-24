package cn.itcast.jdbc;

import cn.itcast.domain.Department;
import cn.itcast.utils.JdbcUtils;
import org.junit.Test;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

public class Test03 {
    @Test
    public void query()throws Exception{
        /*1.创建连接*/
        Connection connection = JdbcUtils.getConnection();
        /*2.创建操作数据库的对象*/
        Statement statement = connection.createStatement();

        ResultSet resultSet = statement.executeQuery("select * from department ");
        ArrayList<Department> departments = new ArrayList<>();
        while(resultSet.next()){
            int dept_id = resultSet.getInt("dept_id");
            String dept_name = resultSet.getString("dept_name");
            Department department = new Department(dept_id, dept_name);
            departments.add(department);
        }
        System.out.println(departments);
        JdbcUtils.close(connection,statement,resultSet);
    }
}
