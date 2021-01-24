package cn.itcast.dao;

import cn.itcast.domain.Person;
import org.apache.ibatis.annotations.Select;


public interface PersonDao {

    @Select("select * from person where id=#{id}")
    Person findById(Integer id)throws Exception;
}
