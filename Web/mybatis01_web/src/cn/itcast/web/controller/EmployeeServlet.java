package cn.itcast.web.controller;

import cn.itcast.core.BaseServlet;
import cn.itcast.domain.Employee;
import cn.itcast.service.EmployeeService;
import cn.itcast.service.impl.EmployeeServiceImpl;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;

@WebServlet("/EmployeeServlet/*")
public class EmployeeServlet extends BaseServlet {

    private EmployeeService employeeService=new EmployeeServiceImpl();

    public void findAll(HttpServletRequest request,HttpServletResponse response) throws Exception{
        List<Employee> all = employeeService.findAll();
        request.setAttribute("emp",all);
        request.getRequestDispatcher("/findAll.jsp").forward(request,response);
    }
}
