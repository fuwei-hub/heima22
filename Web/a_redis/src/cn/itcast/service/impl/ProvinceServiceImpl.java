package cn.itcast.service.impl;

import cn.itcast.dao.ProvinceDao;
import cn.itcast.domain.ProvinceRedis;
import cn.itcast.service.ProvinceService;
import cn.itcast.utils.JedisUtils;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.github.pagehelper.util.StringUtil;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import redis.clients.jedis.Jedis;

import java.util.List;

public class ProvinceServiceImpl implements ProvinceService {
    @Override
    public List<ProvinceRedis> findAll() throws Exception {
        Jedis jedis = JedisUtils.getJedis();
        String provinces = jedis.get("provinces");
        if(StringUtil.isEmpty(provinces)){
            SqlSession sqlSession = new SqlSessionFactoryBuilder().build(Resources.getResourceAsReader("MyBatisConfig.xml")).openSession();
            ProvinceDao mapper = sqlSession.getMapper(ProvinceDao.class);
            List<ProvinceRedis> all = mapper.findAll();
            ObjectMapper objectMapper = new ObjectMapper();
            String s = objectMapper.writeValueAsString(all);
            jedis.set("provinces",s);
            sqlSession.close();
            jedis.close();
            return all;
        }else{
            List list = new ObjectMapper().readValue(provinces, List.class);
            return list;
        }
    }
}
