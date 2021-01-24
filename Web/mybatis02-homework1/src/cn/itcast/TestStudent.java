package cn.itcast;

import cn.itcast.service.StudentService;
import cn.itcast.service.impl.StudentServiceimpl;
import com.github.pagehelper.PageInfo;

public class TestStudent {
    private static StudentService studentService=new StudentServiceimpl();
    public static void main(String[] args)throws Exception{
        PageInfo all = studentService.findAll(2, 3);
        System.out.println(all);

    }
}
