package cn.itcast.web.servlet;

import cn.itcast.web.domain.User;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        System.out.println("来了吗?");
        if("admin".equals(username)&&"123456".equals(password)){
            User user = new User(username,password);
            request.getSession().setAttribute("userInfo",user);
            response.sendRedirect(request.getContextPath()+"/success.jsp");
        }else{
            request.getSession().setAttribute("error","输入有误请重新输入");
            request.getRequestDispatcher("/login.jsp").forward(request,response);
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doPost(request, response);
    }
}
