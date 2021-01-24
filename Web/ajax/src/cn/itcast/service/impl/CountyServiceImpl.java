package cn.itcast.service.impl;

import cn.itcast.dao.CountyDao;
import cn.itcast.domain.County;
import cn.itcast.service.CountyService;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.util.List;

public class CountyServiceImpl implements CountyService {
    @Override
    public List<County> findByName(String name) throws Exception {
        SqlSession sqlSession = new SqlSessionFactoryBuilder().build(Resources.getResourceAsReader("mybatis-config.xml")).openSession();
        CountyDao mapper = sqlSession.getMapper(CountyDao.class);
        List<County> list = mapper.findByName("%"+name+"%");
        return list;
    }
}
