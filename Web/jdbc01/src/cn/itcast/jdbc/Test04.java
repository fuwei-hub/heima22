package cn.itcast.jdbc;

import cn.itcast.utils.JdbcUtils;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

public class Test04 {
    public static void main(String[] args) throws Exception {
        System.out.println("请输入工号");
        String s = new Scanner(System.in).nextLine();
        System.out.println("请输入部门名");
        String s1 = new Scanner(System.in).nextLine();
        Connection connection = JdbcUtils.getConnection();
        //预编译
        PreparedStatement preparedStatement = connection.prepareStatement("select * from department where dept_id=? and dept_name=?");
        preparedStatement.setObject(1,s);
        preparedStatement.setObject(2,s1);
        ResultSet resultSet = preparedStatement.executeQuery();
        if(resultSet.next()){
            System.out.println("登录成功");
        }else{
            System.out.println("登陆失败");
        }
        JdbcUtils.close(connection,preparedStatement,resultSet  );
    }
}
