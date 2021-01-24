package com.itheima.controller;

import com.itheima.service.impl.StudentServiceImpl;
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

/**
 * 功能：删除学生
 *该接口接收number 1个参数,删除成功返回true,否则返回false
 * 测试地址:http://localhost:8080/虚拟路径/DeleteStudentServlet?number=heima00X
 */
@WebServlet("/DeleteStudentServlet")
public class DeleteStudentServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doGet(request,response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        try{
            request.setCharacterEncoding("utf-8");
            response.setContentType("application/json;charset=utf-8");

            /*1.获取表单数据*/
            String number = request.getParameter("number");


            /*2.调用业务层的添加方法*/
            new StudentServiceImpl().deleteStu(number);

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
