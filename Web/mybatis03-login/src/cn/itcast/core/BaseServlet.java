package cn.itcast.core;

import com.fasterxml.jackson.databind.ObjectMapper;

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
            Object result = declaredMethod.invoke(this, request, response);
            //4.判断方法上是否有@ResponseBody注解
            if (declaredMethod.isAnnotationPresent(ResponseBody.class)) {
                //把方法的返回值变成JSON格式的字符串，然后写回给浏览器
                String json = new ObjectMapper().writeValueAsString(result);
                response.getWriter().print(json);
            } else {

                if (result != null) {
                    String path = (String) result;
                    if (path.startsWith("RD")) {
                        request.getRequestDispatcher(path.substring(2)).forward(request, response);
                    } else if (path.startsWith("SR")) {
                        response.sendRedirect(request.getContextPath() + path.substring(2));
                    } else {
                        response.sendRedirect(request.getContextPath() + path);
                    }
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
            response.getWriter().println("<h1>找不到了呢</h1>");
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doPost(request, response);
    }
}
