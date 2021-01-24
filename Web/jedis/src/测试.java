import redis.clients.jedis.Jedis;

import java.util.List;

public class 测试 {
    public static void main(String[] args) {
        Jedis jedis = new Jedis("localhost",6379);
        String age = jedis.get("age");
        System.out.println(age);
        jedis.close();
        System.out.println("---------");
        jedis.lpush("student","zhangsan,lisi,wangwu");
        List<String> student = jedis.lrange("student", 0, -1);
        System.out.println(student);

    }
}
