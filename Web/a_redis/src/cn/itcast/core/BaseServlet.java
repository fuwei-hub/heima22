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
        this.doGet(request, response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("utf-8");
        response.setContentType("text/html;charset=utf-8");

        try {
            //1.获取请求的URI
            String uri = request.getRequestURI(); // uri = "/虚拟路径/StudentServlet/add" UserController/login

            //2.从URI中切割出要执行的功能的名字
            int startIndex = uri.lastIndexOf("/")+1;
            String methodName = uri.substring(startIndex);

            //3.通过反射执行对应的方法
            Class clazz = this.getClass();//this 就表示当前Servlet
            Method method = clazz.getDeclaredMethod(methodName, HttpServletRequest.class, HttpServletResponse.class);
            method.setAccessible(true);
            Object result = method.invoke(this, request, response);// this.login(request,response)

            //4.判断方法上是否有@ResponseBody注解
            if(method.isAnnotationPresent(ResponseBody.class)){
                response.setContentType("application/json;charset=utf-8");
                //把方法的返回值变成JSON格式的字符串，然后写回给浏览器
                String json = new ObjectMapper().writeValueAsString(result);
                response.getWriter().print(json);
            }else{
                //5.判断方法是否有返回值，如果有就页面跳转
                if(result!=null){//如果login方法有返回值
                    if(result instanceof String){//如果返回值是String 类型
                        String path = (String)result;// "redirect:/success.jsp"

                        if(path.startsWith("redirect:")){
                            response.sendRedirect(path.substring(9));
                        }else if(path.startsWith("forward:")){
                            request.getRequestDispatcher(path.substring(8)).forward(request,response);
                        }else{
                            request.getRequestDispatcher(path).forward(request,response);
                        }
                    }
                }
            }


        } catch (Exception e) {
            e.printStackTrace();
            response.getWriter().print("服务器忙,请稍候再试");
        }
    }
}
