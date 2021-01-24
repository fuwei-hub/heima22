package cn.itcast.service.impl;

import cn.itcast.dao.CityDao;
import cn.itcast.domain.City;
import cn.itcast.service.CityService;
import cn.itcast.utils.JedisUtils;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.github.pagehelper.util.StringUtil;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import redis.clients.jedis.Jedis;

import java.util.List;

public class CityServiceImpl implements CityService {
    @Override
    public List<City> findByPid(String pid) throws Exception {
        Jedis jedis = JedisUtils.getJedis();
        jedis.del("citys");
        String citys = jedis.get("citys");
        if(StringUtil.isEmpty(citys)){
            SqlSession sqlSession = new SqlSessionFactoryBuilder().build(Resources.getResourceAsReader("MyBatisConfig.xml")).openSession();
            CityDao mapper = sqlSession.getMapper(CityDao.class);
            List<City> list = mapper.findByProvinceID(pid);
            System.out.println(list);
            String s = new ObjectMapper().writeValueAsString(list);
            jedis.set("citys", s);
            sqlSession.close();
            jedis.close();
            return list;
        }else{
            List list = new ObjectMapper().readValue(citys, List.class);
            return list;
        }
    }
}
