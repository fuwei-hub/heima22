package cn.itcast;

import cn.itcast.dao.ClassesDao;
import cn.itcast.domain.Classes;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.util.List;

public class TestClasses {
    public static void main(String[] args) throws Exception {
        SqlSession sqlSession = new SqlSessionFactoryBuilder().build(Resources.getResourceAsReader("mybatis-config.xml")).openSession();
        ClassesDao mapper = sqlSession.getMapper(ClassesDao.class);
        List<Classes> all = mapper.findAll();
        System.out.println(all);
        sqlSession.close();
    }
}
