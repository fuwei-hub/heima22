package cn.itcast.dao;

import cn.itcast.domain.Student;

import javax.swing.*;
import java.util.List;

public interface StudentDao {

    List<Student> findByCid(Integer cid)throws Exception;
}
