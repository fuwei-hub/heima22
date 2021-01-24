package IO第二天;

import java.util.Properties;

public class 使用properties读取配置文件 {
    public static void main(String[] args) throws Exception {
        Properties properties = new Properties();
        properties.load(使用properties读取配置文件.class.getClassLoader().getResourceAsStream(""));
        properties.getProperty("");
        properties.getProperty("");
        properties.getProperty("");
    }
}
