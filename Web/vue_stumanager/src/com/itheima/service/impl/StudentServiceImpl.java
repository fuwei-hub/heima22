package com.itheima.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.itheima.bean.Student;
import com.itheima.mapper.StudentMapper;
import com.itheima.service.StudentService;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.util.List;

public class StudentServiceImpl implements StudentService {
    @Override
    public PageInfo<Student> findByPage(int pageNum, int pageSize) throws Exception{
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(Resources.getResourceAsStream("MyBatisConfig.xml"));
        SqlSession sqlSession = sqlSessionFactory.openSession();
        StudentMapper studentMapper = sqlSession.getMapper(StudentMapper.class);
        PageHelper.startPage(pageNum, pageSize);
        List<Student> students = studentMapper.findAll();
        sqlSession.close();
        return new PageInfo<>(students);
    }

    /*
        删除数据方法
     */
    @Override
    public void deleteStu(String number)throws Exception {
            SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(Resources.getResourceAsStream("MyBatisConfig.xml"));
            SqlSession sqlSession = sqlSessionFactory.openSession(true);
            StudentMapper studentMapper = sqlSession.getMapper(StudentMapper.class);
            studentMapper.deleteStu(number);
            sqlSession.close();
    }

    /*
        修改数据方法
     */
    @Override
    public void updateStu(Student stu)throws Exception {
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(Resources.getResourceAsStream("MyBatisConfig.xml"));
        SqlSession sqlSession = sqlSessionFactory.openSession(true);
        StudentMapper studentMapper = sqlSession.getMapper(StudentMapper.class);
        studentMapper.updateStu(stu);
        sqlSession.close();
    }

    /*
        添加数据方法
     */
    @Override
    public void addStu(Student stu) throws Exception{
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(Resources.getResourceAsStream("MyBatisConfig.xml"));
        SqlSession sqlSession = sqlSessionFactory.openSession(true);
        StudentMapper studentMapper = sqlSession.getMapper(StudentMapper.class);
        studentMapper.addStu(stu);
        sqlSession.close();
    }

}
