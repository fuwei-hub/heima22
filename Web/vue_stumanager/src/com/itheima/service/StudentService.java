package com.itheima.service;

import com.github.pagehelper.PageInfo;
import com.itheima.bean.Student;

public interface StudentService {
    /**
     * 分页查询学生信息
     * @param pageNum 第几页
     * @param pageSize 每页显示几条数据
     * @return
     * @throws Exception
     */
    PageInfo<Student> findByPage(int pageNum, int pageSize) throws Exception;

    /**
     * 添加学生
     * @param stu
     */
    public abstract void addStu(Student stu)throws Exception;

    /**
     * 更新学生
     * @param stu
     */
    public abstract void updateStu(Student stu)throws Exception;

    /**
     * 删除学生
     * @param number
     */
    public abstract void deleteStu(String number)throws Exception;
}
