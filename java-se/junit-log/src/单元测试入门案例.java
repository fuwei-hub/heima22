import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.FileInputStream;
import java.io.FileReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Properties;
import java.util.ResourceBundle;

//方法必须被public所修饰  必须无参无返回值 可以抛出异常   会运行被@Test所注解的方法
public class 单元测试入门案例 {
    ResourceBundle bundle;
    @Before
    public void read(){
        System.out.println("我在show前面执行");
        bundle = ResourceBundle.getBundle("config");
    }

    @Test
    public  void show() throws Exception {
        //System.out.println(1+2);
        System.out.println(bundle.getString("name"));
        System.out.println(bundle.getString("age"));
        System.out.println(bundle.getString("address"));
    }
    @Test
    public  void show2() {
       // System.out.println(1+3);
        System.out.println(bundle.getString("name"));
        System.out.println(bundle.getString("age"));
        System.out.println(bundle.getString("address"));
    }
    @After
    public  void show3() {
        System.out.println("我在show后面执行");
    }
}
