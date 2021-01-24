package test;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.net.http.HttpResponse;


//编写测试类,输出语句用日志代替
public class Test02  {
//创建一个记录日志的对象,专门来记录当前类中的信息
    private static final Logger LOGGER=LoggerFactory.getLogger(Test02.class);
    public static void main(String[] args) {
        try {
            chifan chifan = new chifan();
            test.chifan.chi();
            LOGGER.debug("我开始了");
        }catch (Exception e){
            LOGGER.error("出错了呢",e);
        }
    }
}


