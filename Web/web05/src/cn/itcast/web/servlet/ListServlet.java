package cn.itcast.web.servlet;

import cn.itcast.domain.Student;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;

@WebServlet("/ListServlet")
public class ListServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        ArrayList<Student> students = new ArrayList<>();
        students.add(new Student("张三","23","大🐎"));
        students.add(new Student("李四","24","小🐎"));
        students.add(new Student("王五","25","黑🐎"));
        students.add(new Student("赵六","26","淖🐎"));
        students.add(new Student("玄七","27","白🐎"));
        request.getSession().setAttribute("users",students);
        request.getRequestDispatcher("/list.jsp").forward(request,response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doPost(request, response);
    }
}
