package test;

import org.junit.After;
import org.junit.Before;

import java.io.FileInputStream;
import java.util.Properties;

/*编写单元测试,ChiFan@Before @ChiFan @After
 *方法必须被public所修饰,无参无返回值,可以声明异常*/
public class Test01 {
    Properties properties;

    @Before
    public void show1() throws Exception {
        properties = new Properties();
        properties.load(new FileInputStream("D:\\code\\java-se\\junit-log\\resources\\config.properties"));
    }

    @org.junit.Test
    public void show2() {
        System.out.println(properties.getProperty("name"));
        System.out.println(properties.getProperty("age"));
        System.out.println(properties.getProperty("address"));
    }

    @After
    public void show3() {
        System.out.println("运行结束了呢");
    }
}
