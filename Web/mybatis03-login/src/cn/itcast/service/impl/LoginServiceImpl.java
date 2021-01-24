package cn.itcast.service.impl;

import cn.itcast.dao.LoginDao;
import cn.itcast.domain.Login;
import cn.itcast.service.LoginService;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.util.List;

public class LoginServiceImpl implements LoginService {
    @Override
    public Login login(String username, String password) throws Exception {
        SqlSession sqlSession = new SqlSessionFactoryBuilder().build(Resources.getResourceAsReader("mybatis-config.xml")).openSession(true);
        LoginDao mapper = sqlSession.getMapper(LoginDao.class);
        Login user = mapper.findByUsernameAndPassword(username, password);
        return user;
    }
}
