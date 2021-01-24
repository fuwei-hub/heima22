package com.itheima.controller;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.github.pagehelper.PageInfo;
import com.github.pagehelper.util.StringUtil;
import com.itheima.bean.Student;
import com.itheima.service.impl.StudentServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * 功能：分页查询学生列表
 *该接口接收startPage,pageSize两个参数,返回当前页需要的数据
 * 测试地址:http://localhost:8080/虚拟路径/FindStudentByPageServlet?currentPage=2&pageSize=4
 */
@WebServlet("/FindStudentByPageServlet")
public class FindStudentByPageServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doGet(request,response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        try{
            request.setCharacterEncoding("utf-8");
            response.setContentType("application/json;charset=utf-8");
            Thread.sleep(1000);
            /*1.获取表单数据*/
            String _currentPage = request.getParameter("currentPage");
            System.out.println(_currentPage);
            if(StringUtil.isEmpty(_currentPage)){
                _currentPage = "1";
            }
            String _pageSize = request.getParameter("pageSize");
            System.out.println(_pageSize);
            if(StringUtil.isEmpty(_pageSize)){
                _pageSize = "10";
            }

            int currentPage = Integer.parseInt(_currentPage);
            int pageSize = Integer.parseInt(_pageSize);

            /*2.调用service分页查询*/
            PageInfo<Student> pageInfo = new StudentServiceImpl().findByPage(currentPage, pageSize);

            /*3.将结果转成JSON返回浏览器*/
            response.getWriter().println(new ObjectMapper().writeValueAsString(pageInfo));
        }catch (Exception e){
            e.printStackTrace();
        }

    }
}
