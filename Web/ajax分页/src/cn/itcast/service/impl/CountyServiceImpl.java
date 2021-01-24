package cn.itcast.service.impl;

import cn.itcast.dao.CountyDao;
import cn.itcast.domain.County;
import cn.itcast.service.CountyService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.util.List;

public class CountyServiceImpl implements CountyService {
    @Override
    public PageInfo findAll(Integer pagenum, Integer pagesize) throws Exception {
        SqlSession sqlSession = new SqlSessionFactoryBuilder().build(Resources.getResourceAsReader("mybatis-config.xml")).openSession(true);
        CountyDao mapper = sqlSession.getMapper(CountyDao.class);
        //设置分页的页数和每页显示的数量
        PageHelper.startPage(pagenum,pagesize);
        //调用dao中的方法 获取数据
        List<County> all = mapper.findAll();
        //包装成pageInfo对象传给controller
        PageInfo<County> countyPageInfo = new PageInfo<>(all);

        return countyPageInfo;
    }
}
