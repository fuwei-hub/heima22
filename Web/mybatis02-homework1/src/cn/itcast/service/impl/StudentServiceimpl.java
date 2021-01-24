package cn.itcast.service.impl;


import cn.itcast.dao.StudentDao;
import cn.itcast.domain.Student;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.util.List;

public class StudentServiceimpl implements cn.itcast.service.StudentService {

    @Override
    public PageInfo<Student> findAll(Integer pagenum, Integer pagesize) throws Exception {
        SqlSessionFactory build = new SqlSessionFactoryBuilder().build(Resources.getResourceAsReader("mybatis-config.xml"));
        SqlSession sqlSession = build.openSession();
        StudentDao mapper = sqlSession.getMapper(StudentDao.class);
        //测试类中使用分页
        PageHelper.startPage(pagenum,pagesize);
        List<Student> all = mapper.findAll();
        //封装在pageinfo里面
        PageInfo<Student> studentPageInfo = new PageInfo<>(all);
        sqlSession.close();
        return studentPageInfo;
    }
}
