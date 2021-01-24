package cn.itcast;

import cn.itcast.dao.CardDao;
import cn.itcast.dao.StudentDao;
import cn.itcast.domain.Card;
import cn.itcast.domain.Student;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.util.List;

public class Test01 {
  @Test
    public void findAll()throws Exception{
        SqlSession sqlSession = new SqlSessionFactoryBuilder().build(Resources.getResourceAsReader("mybatis-config.xml")).openSession(true);
        StudentDao mapper = sqlSession.getMapper(StudentDao.class);
        List<Student> all = mapper.findAll();
        for (Student student : all) {
            System.out.println(student);
        }
    }


    @Test
    public void findById()throws Exception{
        SqlSession sqlSession = new SqlSessionFactoryBuilder().build(Resources.getResourceAsReader("mybatis-config.xml")).openSession(true);
        StudentDao mapper = sqlSession.getMapper(StudentDao.class);
        Student byId = mapper.findById(3);
        System.out.println(byId);
    }



    @Test
    public void findByNameOrAge()throws Exception{
        SqlSession sqlSession = new SqlSessionFactoryBuilder().build(Resources.getResourceAsReader("mybatis-config.xml")).openSession(true);
        StudentDao mapper = sqlSession.getMapper(StudentDao.class);
        List<Student> all = mapper.findByNameOrAge("张三",25);
        for (Student student : all) {
            System.out.println(student);
        }
    }
        @Test
        public void findAllCard()throws Exception{
            SqlSession sqlSession = new SqlSessionFactoryBuilder().build(Resources.getResourceAsReader("mybatis-config.xml")).openSession(true);
            CardDao mapper = sqlSession.getMapper(CardDao.class);
            List<Card> all = mapper.findAll();
            for (Card card : all) {
                System.out.println(card);
            }
        }
}
