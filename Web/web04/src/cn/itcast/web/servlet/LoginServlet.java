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
        request.setCharacterEncoding("utf-8");
        response.setContentType("text/html;charset=utf-8");
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        User user = new User(username, password);
        if("jack".equalsIgnoreCase(user.getUsername())&&"123456".equals(user.getPassword())){
            request.getSession().setAttribute("userdata",user);
            response.sendRedirect(request.getContextPath()+"/Success.jsp");
        }else{
            request.setAttribute("cuowu","您输入的账号或密码错误请重新输入");
            request.getRequestDispatcher("/Login.jsp").forward(request,response);
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doPost(request, response);
    }
}
