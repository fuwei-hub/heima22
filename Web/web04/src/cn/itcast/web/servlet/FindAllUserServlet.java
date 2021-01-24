package cn.itcast.web.servlet;

import cn.itcast.web.domain.User;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebServlet("/FindAllUserServlet")
public class FindAllUserServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("utf-8");
        response.setContentType("text/html;charset=utf-8");
        HttpSession session = request.getSession();
        User userdata =(User)session.getAttribute("userdata");
        response.getWriter().println("<table border=\"1px\" cellpadding=\"0px\" cellspacing=\"0px\" style=\" text-align: center; width: 500px;height: 310px;font-size: 20px;margin: auto; margin-top: 100px\">\n" +
                "    <tr>\n" +
                "        <td>序号</td>\n" +
                "        <td>用户名</td>\n" +
                "        <td>密码</td>\n" +
                "    </tr>\n" +
                "    <tr>\n" +
                "        <td>"+ 1+"</td>\n" +
                "        <td>"+ userdata.getUsername()+"</td>\n" +
                "        <td>"+ userdata.getPassword()+"</td>\n" +
                "    </tr>\n" +
                "</table>");
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doPost(request, response);
    }
}
