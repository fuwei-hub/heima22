package cn.itcast.service.impl;

import cn.itcast.dao.UserDao;
import cn.itcast.domain.User;
import cn.itcast.service.UserService;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class UserServiceImpl implements UserService {
    @Override
    public User login(String username, String password) throws Exception {
        SqlSession sqlSession = new SqlSessionFactoryBuilder().build(Resources.getResourceAsReader("mybatis-config.xml")).openSession();
        UserDao mapper = sqlSession.getMapper(UserDao.class);
        User user = mapper.findByUsernameAndPassword(username, password);

        return user;
    }
}
