package cn.itcast.web.servlet;

import cn.itcast.web.domain.Student;

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
        students.add(new Student("张三","18","山西"));
        students.add(new Student("张三","18","山西"));
        students.add(new Student("张三","18","山西"));
        students.add(new Student("张三","18","山西"));
        students.add(new Student("张三","18","山西"));
        request.getSession().setAttribute("stus",students);
        request.getRequestDispatcher("/list.jsp").forward(request,response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doPost(request, response);
    }
}
