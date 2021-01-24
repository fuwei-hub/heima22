package cn.itcast.service.impl;

import cn.itcast.dao.LoginDao;
import cn.itcast.domain.Login;
import cn.itcast.domain.Person;
import cn.itcast.service.PersonService;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.apache.log4j.lf5.util.Resource;

import java.util.List;

public class PersonServiceImpl implements PersonService {
    @Override
    public List<Person> findAll() throws Exception {
        SqlSessionFactory build = new SqlSessionFactoryBuilder().build(Resources.getResourceAsReader("mybatis-config.xml"));
        SqlSession sqlSession = build.openSession();
        LoginDao mapper = sqlSession.getMapper(LoginDao.class);
        List<Person> all = mapper.findAll();
        sqlSession.close();
        return all;

    }

    @Override
    public Integer delete(Integer id) throws Exception {
        SqlSessionFactory build = new SqlSessionFactoryBuilder().build(Resources.getResourceAsReader("mybatis-config.xml"));
        SqlSession sqlSession = build.openSession(true);
        LoginDao mapper = sqlSession.getMapper(LoginDao.class);
        Integer delete = mapper.delete(id);
        sqlSession.close();
        return delete;
    }

    @Override
    public Integer addStudent(Person person) throws Exception {
        SqlSessionFactory build = new SqlSessionFactoryBuilder().build(Resources.getResourceAsReader("mybatis-config.xml"));
        SqlSession sqlSession = build.openSession(true);
        LoginDao mapper = sqlSession.getMapper(LoginDao.class);
        Integer integer = mapper.addStudent(person);
        return integer;
    }

    @Override
    public Person findById(Integer id) throws Exception {
        SqlSessionFactory build = new SqlSessionFactoryBuilder().build(Resources.getResourceAsReader("mybatis-config.xml"));
        SqlSession sqlSession = build.openSession(true);
        LoginDao mapper = sqlSession.getMapper(LoginDao.class);
        Person person = mapper.findById(id);
        sqlSession.close();
        return person;
    }

    @Override
    public Integer update(Person person) throws Exception {
        SqlSession sqlSession = new SqlSessionFactoryBuilder().build(Resources.getResourceAsReader("mybatis-config.xml")).openSession(true);
        LoginDao mapper = sqlSession.getMapper(LoginDao.class);
        Integer update = mapper.update(person);
        sqlSession.close();
        return update;
    }
}
