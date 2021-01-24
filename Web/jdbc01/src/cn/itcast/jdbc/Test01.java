package cn.itcast.jdbc;

import org.junit.Test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Test01 {
    @Test
    public void query() throws Exception {
        /*1.创建连接*/
        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/db2","root","root");
        /*2.创建操作数据库的对象*/
        Statement statement = connection.createStatement();
        /*3.操作数据库（增删改[查]）*/
        ResultSet resultSet = statement.executeQuery("select " +
                "e.emp_id," +
                "e.emp_name," +
                "e.emp_wage," +
                "d.dept_name" +
                " from (select max(emp_wage) wage,dept_id id from employee group by dept_id" +
                ")temp" +
                " left join employee e on temp.wage=e.emp_wage and temp.id=e.dept_id" +
                " right join department d on temp.id=d.dept_id;");
        while(resultSet.next()){
            Object emp_id = resultSet.getObject("e.emp_id");
            Object dept_id = resultSet.getObject("e.emp_name");
            Object emp_wage = resultSet.getObject("e.emp_wage");
            Object dept_name = resultSet.getObject("d.dept_name");
            System.out.println(emp_id+","+dept_id+","+emp_wage+","+dept_name);
        }
        /*释放资源*/
        resultSet.close();
        statement.close();
        connection.close();
    }
}
