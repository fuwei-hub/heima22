package cn.itcast.web;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/UserServlet")
public class UserServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html;charset=utf-8");
        String username = request.getParameter("username");
        int inputPassword =Integer.parseInt(request.getParameter("inputPassword")) ;
        if("jack".equals(username)&&123==inputPassword){
            ServletContext servletContext = request.getServletContext();
            servletContext.setAttribute("name","jack");
            SuccessServlet successServlet = new SuccessServlet();
            successServlet.doPost(request,response);
        }else{
           response.sendRedirect("Failed.html");
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doPost(request, response);
    }
}
