package cn.itcast;

import cn.itcast.dao.UserDao;
import cn.itcast.domain.User;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.List;

public class MapperTest {
    private SqlSession sqlSession;

    @Before
    public void src()throws Exception{
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(Resources.getResourceAsReader("mybatis-config.xml"));
        sqlSession = sqlSessionFactory.openSession(true);
    }

    @Test
    public void findAll()throws Exception{
        UserDao mapper = sqlSession.getMapper(UserDao.class);
        //分页显示
        PageHelper.startPage(1,2);
        List<User> all = mapper.findAll();
        //封装成pageInfo对象  里面存储了分页的各种方法和数据
        PageInfo<User> userPageInfo = new PageInfo<>(all);
        System.out.println(userPageInfo);
    }

    @Test
    public void findById()throws Exception{
        UserDao mapper = sqlSession.getMapper(UserDao.class);
        User byId = mapper.findById(4);
        System.out.println(byId);
    }

    @Test
    public void update()throws Exception{
        UserDao mapper = sqlSession.getMapper(UserDao.class);
        int i = mapper.update(new User(4, "付付", null, null, null));
        System.out.println(i);
    }

    @Test// 动态sql
    public void findByCondition()throws Exception{
        UserDao mapper = sqlSession.getMapper(UserDao.class);
        User user = new User();
        user.setUid(3);
        user.setName("尼古拉斯赵五");
        user.setEmail("nglszq@qq.com");
        List<User> byCondition = mapper.findByCondition(user);
        System.out.println(byCondition);
    }

    @After
    public void desc()throws Exception{
        sqlSession.close();
    }
}
