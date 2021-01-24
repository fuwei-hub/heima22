package cn.itcast.controller;

import cn.itcast.core.BaseServlet;
import cn.itcast.domain.User;
import cn.itcast.service.impl.UserServiceImpl;


import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/UserController/*")
public class UserController extends BaseServlet {
    public void login(HttpServletRequest request, HttpServletResponse response) throws Exception {
       //1.获取表单数据
        String username = request.getParameter("username");
        String password =request.getParameter("password") ;
        /*System.out.println(username);
        System.out.println(password);*/
        //2.获取service对象
        UserServiceImpl userService = new UserServiceImpl();
        User login = userService.login(username, password);
        //3.跳转页面
        if(login!=null){
            request.getSession().setAttribute("userIn",login);
            response.sendRedirect(request.getContextPath()+"/success.jsp");
        }else{
            request.setAttribute("error","账号密码错误，请重新输入");
            request.getRequestDispatcher("/login.jsp").forward(request,response);
        }
    }
}
