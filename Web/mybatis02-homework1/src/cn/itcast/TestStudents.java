package cn.itcast;

import cn.itcast.dao.StudentsDao;
import cn.itcast.domain.Student;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.util.List;

public class TestStudents {
    public static void main(String[] args)throws Exception {
        SqlSession sqlSession = new SqlSessionFactoryBuilder().build(Resources.getResourceAsReader("mybatis-config.xml")).openSession();
        StudentsDao mapper = sqlSession.getMapper(StudentsDao.class);
        List<Student> all = mapper.findAll();
        System.out.println(all);
        sqlSession.close();
    }
}
