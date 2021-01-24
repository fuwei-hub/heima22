package cn.itcast.dao;

import cn.itcast.domain.County;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface CountyDao {

    @Select("select * from county where name like #{name}")
    List<County>findByName(String name)throws Exception;
}
