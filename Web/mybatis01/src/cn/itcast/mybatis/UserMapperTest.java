package cn.itcast.mybatis;

import cn.itcast.mybatis.domain.User;
import com.sun.xml.internal.messaging.saaj.packaging.mime.util.QEncoderStream;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.util.List;
import java.util.ResourceBundle;

public class UserMapperTest {
    @Test
    public void selectAll() throws Exception {
        /*1.读取配置文件并创建SqlSessionFactory*/
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(Resources.getResourceAsReader("mybatis-config.xml"));
        /*2.获取sqlSession[这是mybatis的重要API, 使用它可以操作数据库crud*/
        SqlSession sqlSession = sqlSessionFactory.openSession();
        /*
            3.执行查询所有
            第一参数:指的是sql语句的位置,使用namespace.statementId表示
        */
        List<User> users = sqlSession.selectList("UserMapper.selectAll");
        for (User user : users) {
            System.out.println(user);
        }
        /*4.释放资源*/
        sqlSession.close();
    }


    @Test
    public void selectByName() throws Exception {
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(Resources.getResourceAsStream("mybatis-config.xml"));
        SqlSession sqlSession = sqlSessionFactory.openSession();
        User user = sqlSession.selectOne("UserMapper.selectByName", "尼古拉斯赵四");
        sqlSession.close();
        System.out.println(user);
    }

    @Test
    public void add() throws Exception {
        SqlSessionFactory build = new SqlSessionFactoryBuilder().build(Resources.getResourceAsReader("mybatis-config.xml"));
        SqlSession sqlSession = build.openSession(true);
        User user = new User(null, "张三", "123456", "1454944260@qq.com", "1998-04-24");
        int i = sqlSession.insert("UserMapper.add", user);
        sqlSession.close();
        System.out.println("共" + i + "行受到影响");
    }

    @Test
    public void update() throws Exception {
        SqlSessionFactory sessionFactory = new SqlSessionFactoryBuilder().build(Resources.getResourceAsReader("mybatis-config.xml"));
        SqlSession sqlSession = sessionFactory.openSession(true);
        int i = sqlSession.update("UserMapper.update", new User(5, "付付", null, null, null));
        sqlSession.close();
        System.out.println("共" + i + "行受到影响");
    }

    @Test
    public void del() throws Exception {
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(Resources.getResourceAsReader("mybatis-config.xml"));
        SqlSession sqlSession = sqlSessionFactory.openSession(true);
        int delete = sqlSession.delete("UserMapper.del", 5);
        System.out.println("共" + delete + "行受到影响");
        sqlSession.close();
    }
}
