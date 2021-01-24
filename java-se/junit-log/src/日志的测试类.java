import org.slf4j.Logger;
import org.slf4j.LoggerFactory;



public class 日志的测试类 {

    private static final Logger LOGGER=LoggerFactory.getLogger(日志的测试类.class);


    public static void main(String[] args) {
        try {
            LOGGER.info("程序开始执行了");
            int i=2/0;
            System.out.println("程序运行结束了");
        } catch (Exception e) {
            LOGGER.error("程序出错了",e);
        }
    }
}
