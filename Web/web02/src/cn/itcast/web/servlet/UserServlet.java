package cn.itcast.web.servlet;

import cn.itcast.web.domain.User;

import javax.servlet.*;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

public class UserServlet implements Servlet {

    @Override
    public void init(ServletConfig servletConfig) throws ServletException {

    }

    @Override
    public ServletConfig getServletConfig() {
        return null;
    }

    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        //服务器告诉浏览器用UTF-8来解析text大类中的html文件
        servletResponse.setContentType("text/html;charset=UTF-8");
        //获取一个输出流,向浏览器写HTML文件
        PrintWriter writer = servletResponse.getWriter();
        ArrayList<User> users = new ArrayList<>();
        User user1 = new User("100", "张三", 20);
        User user2 = new User("200", "李四", 22);
        User user3 = new User("300", "王五", 48);
        User user4 = new User("400", "赵六", 26);
        User user5 = new User("500", "王八", 19);
        users.add(user1);
        users.add(user2);
        users.add(user3);
        users.add(user4);
        users.add(user5);
        writer.println("<table border='1px' cellpadding='0px 'cellspacing='0px' style='text-align: center; width: 500px;height: auto;font-size: 20px;margin: auto; margin-top: 100px'>" +
                "    <tr style='font-weight: bold; font-size: 25px'>");
        writer.println("<tr style='font-weight: bold; font-size: 25px ; height:50px'>\n" +
                "        <td>编号</td>\n" +
                "        <td>姓名</td>\n" +
                "        <td>年龄</td>\n" +
                "    </tr>");
        for (User user : users) {
           writer.println("<tr style='height:50px'>\n" +
                   "        <td>"+user.getId()+"</td>\n" +
                   "        <td>"+user.getName()+"</td>\n" +
                   "        <td>"+user.getAge()+"</td>\n" +
                   "    </tr>");

        }
        writer.println("</table>");
    }

    @Override
    public String getServletInfo() {
        return null;
    }

    @Override
    public void destroy() {

    }
}
