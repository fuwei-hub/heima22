package cn.itcast.Service.impl;

import cn.itcast.Dao.LoginDao;
import cn.itcast.Service.LoginService;
import cn.itcast.domain.Login;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class LoginServiceImpl implements LoginService {
    @Override
    public Login UserLogin(String username, String password) throws Exception {
        SqlSession sqlSession = new SqlSessionFactoryBuilder().build(Resources.getResourceAsReader("mybatis-config.xml")).openSession(true);
        LoginDao mapper = sqlSession.getMapper(LoginDao.class);
        Login user = mapper.findByUsernameAndPassword(username, password);
        sqlSession.close();
        return user;
    }
}
