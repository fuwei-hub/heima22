package cn.itcast.dao.impl;

import cn.itcast.dao.RentInfoDao;
import cn.itcast.domain.Host;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.util.List;

public class RentInfoDaoImpl implements RentInfoDao {
    @Override
    public List<Host> findAll() throws Exception {
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(Resources.getResourceAsReader("mybatis-config.xml"));
        SqlSession sqlSession = sqlSessionFactory.openSession();
        List<Host> list = sqlSession.selectList("HostMapper.findAll");
        sqlSession.close();
        return list;
    }
}
