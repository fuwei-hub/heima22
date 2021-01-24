package cn.itcast.dao;

import cn.itcast.domain.Student;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface StudentDao {

    @Select("select * from student where cid=#{cid}")
    List<Student> findByCid(Integer cid)throws Exception;
}
