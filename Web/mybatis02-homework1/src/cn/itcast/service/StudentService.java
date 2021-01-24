package cn.itcast.service;

import cn.itcast.domain.Student;
import com.github.pagehelper.PageInfo;

import java.util.List;

public interface StudentService {
    PageInfo<Student> findAll(Integer pagenum, Integer pagesize)throws Exception;
}
