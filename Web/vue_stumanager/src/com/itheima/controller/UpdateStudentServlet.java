package com.itheima.controller;

import com.itheima.bean.Student;
import com.itheima.service.impl.StudentServiceImpl;
import org.apache.commons.beanutils.BeanUtils;
import org.apache.commons.beanutils.ConvertUtils;
import org.apache.commons.beanutils.Converter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Map;

/**
 * 功能：更新学生
 *该接口接收number,name,birthday,address四个参数,更新成功返回true,否则返回false
 * 测试地址:http://localhost:8080/虚拟路径/UpdateStudentServlet?number=heima00X&name=jack&birthday=2020-09-09&address=淖马村
 */
@WebServlet("/UpdateStudentServlet")
public class UpdateStudentServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doGet(request,response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        try{
            request.setCharacterEncoding("utf-8");
            response.setContentType("application/json;charset=utf-8");

            /*1.获取表单数据*/
            Map<String, String[]> map = request.getParameterMap();
            //封装Student对象
            Student stu = new Student();
            //注册日期转换器方法
            dateConvert();
            BeanUtils.populate(stu,map);


            /*2.调用业务层的添加方法*/
            new StudentServiceImpl().updateStu(stu);

            /*3.重定向到分页查询功能*/
           response.getWriter().println(true);

        }catch (Exception e){
            e.printStackTrace();
            response.getWriter().println(false);
        }
    }

    /*
        日期转换
     */
    private void dateConvert() {
        ConvertUtils.register(new Converter() {
            public Object convert(Class type, Object value) {
                SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
                try {
                    return simpleDateFormat.parse(value.toString());
                } catch (Exception e) {
                    e.printStackTrace();
                }
                return null;
            }
        }, Date.class);
    }
}
