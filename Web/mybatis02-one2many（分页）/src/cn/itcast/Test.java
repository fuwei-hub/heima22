package cn.itcast;

import cn.itcast.dao.ClassesDao;
import cn.itcast.domain.Classes;
import com.github.pagehelper.PageHelper;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.util.List;

public class Test {
    public static void main(String[] args) throws Exception{
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(Resources.getResourceAsReader("mybatis-config.xml"));
        SqlSession sqlSession = sqlSessionFactory.openSession(true);
        ClassesDao mapper = sqlSession.getMapper(ClassesDao.class);
        PageHelper.startPage(1,2);
        List<Classes> all = mapper.findAll();
        System.out.println(all);
    }
}
