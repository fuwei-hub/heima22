package cn.itcast.homework.datasources;

import java.sql.Connection;

public class Test {
    public static void main(String[] args) throws Exception {
        MyDataSources myDataSources = new MyDataSources();
        for (int i = 0; i < 15; i++) {
            Connection connection = myDataSources.getConnection();
            connection.close();
            int size = myDataSources.getSize();
            System.out.println("还有" + size + "条");
            System.out.println(connection);
        }
    }
}
