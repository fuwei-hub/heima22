package cn.itcast.web;


import cn.itcast.domain.Student;
import org.apache.commons.beanutils.BeanUtils;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.*;

@WebServlet("/AddStudentServlet")
public class AddStudentServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        try {
            request.setCharacterEncoding("utf-8");
            response.setContentType("text/html;charset=utf-8");
            Map<String, String[]> parameterMap = request.getParameterMap();
            Student student = new Student();
            BeanUtils.populate(student, parameterMap);
            ArrayList<Student> studets = new ArrayList<Student>();
            Collections.sort(studets, new Comparator<Student>() {
                @Override
                public int compare(Student o1, Student o2) {
                    return o2.getScord() - o1.getScord() == 0 ? o2.getAge() - o1.getAge() : o2.getScord() - o1.getScord();
                }
            });
            BufferedWriter bw = new BufferedWriter(new FileWriter("D:/a.txt", true));
            bw.write(student.getUsername() + "," + student.getAge() + "," + student.getScord());
            bw.newLine();
            bw.close();
            response.getWriter().write("三秒之后跳转至学生管理系统主页");
            response.setHeader("refresh", "3;"+request.getContextPath()+"/index.html");
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doPost(request, response);
    }
}
