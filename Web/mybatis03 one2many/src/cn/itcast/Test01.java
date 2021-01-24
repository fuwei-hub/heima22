package cn.itcast;

import cn.itcast.dao.ClassesDao;
import cn.itcast.domain.Classes;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.util.List;

public class Test01 {
    public static void main(String[] args)throws Exception {
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(Resources.getResourceAsReader("mybatis-config.xml"));
        SqlSession sqlSession = sqlSessionFactory.openSession();
        ClassesDao mapper = sqlSession.getMapper(ClassesDao.class);
        List<Classes> all = mapper.findAll();
        System.out.println(all);
        sqlSession.close();
    }
}
