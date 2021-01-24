package cn.itcast;

import cn.itcast.dao.StudentDao;
import cn.itcast.dao.StudentsDao;
import cn.itcast.domain.Student;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.util.List;


public class TestStudent {

    @Test
    public  void testStudent1()throws Exception {
        SqlSession sqlSession = new SqlSessionFactoryBuilder().build(Resources.getResourceAsReader("mybatis-config.xml")).openSession();
        Student student = new Student();
        student.setCid(1);
        StudentDao mapper = sqlSession.getMapper(StudentDao.class);
        List<Student> all = mapper.findAll(student);
        System.out.println(all);


    }
    @Test
    public void testStudent()throws Exception{
        SqlSession sqlSession = new SqlSessionFactoryBuilder().build(Resources.getResourceAsReader("mybatis-config.xml")).openSession();
        StudentDao mapper = sqlSession.getMapper(StudentDao.class);
        List<Student> all2 = mapper.findAll2(8, 9, 10, 11);
        System.out.println(all2);
    }
}
