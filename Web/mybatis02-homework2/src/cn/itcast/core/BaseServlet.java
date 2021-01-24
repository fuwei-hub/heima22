package cn.itcast.core;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.lang.reflect.Method;


public class BaseServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("utf-8");
        response.setContentType("text/html;charset=utf-8");
        try {
            String requestURI = request.getRequestURI();
            /*String[] split = requestURI.split("/");
            String methName = split[split.length - 1];*/
            String methName = requestURI.substring(requestURI.lastIndexOf("/") + 1);
            Class clazz = this.getClass();// 类名.class   class.forName(全类名)
            Method declaredMethod = clazz.getDeclaredMethod(methName, HttpServletRequest.class, HttpServletResponse.class);
            declaredMethod.setAccessible(true);
            declaredMethod.invoke(this,request,response);
        } catch (Exception e) {
            e.printStackTrace();
            response.getWriter().println("<h1>找不到了呢</h1>");
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doPost(request, response);
    }
}
