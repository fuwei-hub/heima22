package cn.itcast.utils;

import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPool;
import redis.clients.jedis.JedisPoolConfig;

import java.util.ResourceBundle;

public class JedisUtils {
    //最大连接数
    private static int maxTotal;
    //最大空闲数
    private static int maxIdel;
    //主机
    private static String host;
    //端口
    private static int port;

    private static JedisPool jedisPool;

    static{
        try{
            ResourceBundle bundle = ResourceBundle.getBundle("redis");
            maxTotal = Integer.parseInt(bundle.getString("redis.maxTotal"));
            maxIdel= Integer.parseInt(bundle.getString("redis.maxIdel"));
            host= bundle.getString("redis.host");
            port= Integer.parseInt(bundle.getString("redis.port"));

            JedisPoolConfig config = new JedisPoolConfig();
            config.setMaxTotal(maxTotal);
            config.setMaxIdle(maxIdel);

            jedisPool = new JedisPool(config,host,port);
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    public static Jedis getJedis(){
        return jedisPool.getResource();
    }

    public static void close(Jedis jedis){
        if(jedis!=null){
            jedis.close();
        }
    }
}
