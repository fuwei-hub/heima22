package cn.itcast;

import cn.itcast.dao.CardDao;
import cn.itcast.domain.Card;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.util.List;

public class TestCard {
    public static void main(String[] args)throws Exception {
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(Resources.getResourceAsReader("mybatis-config.xml"));
        SqlSession sqlSession = sqlSessionFactory.openSession();
        CardDao mapper = sqlSession.getMapper(CardDao.class);
        List<Card> all = mapper.findAll();
        System.out.println(all);
        sqlSession.close();
    }
}
