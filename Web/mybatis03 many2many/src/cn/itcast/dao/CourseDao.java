package cn.itcast.dao;

import cn.itcast.domain.Course;
import org.apache.ibatis.annotations.Select;

import javax.swing.*;
import java.util.List;

public interface CourseDao {

    @Select("select * from stu_cr inner join course on stu_cr.cid=course.id  where sid=#{sid}")
    List<Course>findBySid(Integer sid)throws Exception;
}
