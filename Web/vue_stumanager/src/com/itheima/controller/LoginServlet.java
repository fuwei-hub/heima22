package com.itheima.controller;

import com.itheima.bean.User;
import com.itheima.service.impl.UserServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * 功能:用户登陆
 * 该接口接收username,password两个参数,如果登陆成功返回true，否则返回false
 * 测试:http://localhost:8080/虚拟路径/LoginServlet?username=admin&password=123
 */
@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doGet(request,response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        try{
            request.setCharacterEncoding("utf-8");
            response.setContentType("application/json;charset=utf-8");

            //1.获取表单数据
            String username = request.getParameter("username");
            String password = request.getParameter("password");
            //2.调用Service
            User user = new UserServiceImpl().login(username, password);
            if(user != null){
                request.getSession().setAttribute("user",user);
                response.getWriter().println(true);//登陆成功
            }else{
                response.getWriter().println(false);
            }


        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
