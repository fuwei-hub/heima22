package cn.itcast.controller;

import cn.itcast.core.BaseServlet;
import cn.itcast.domain.Person;
import cn.itcast.service.PersonService;
import cn.itcast.service.impl.PersonServiceImpl;


import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;

@WebServlet("/PersonServlet/*")
public class PersonServlet extends BaseServlet {
    private PersonService personService=new PersonServiceImpl();
   public String findAll(HttpServletRequest request, HttpServletResponse response)throws Exception{
        List<Person> all = personService.findAll();
        request.getSession().setAttribute("person",all);
        return "SR/list.jsp";
        //*response.sendRedirect(request.getContextPath()+"/list.jsp");*//*
    }

    public String delete(HttpServletRequest request,HttpServletResponse response)throws Exception{
        Integer id = Integer.parseInt(request.getParameter("id"));
        Integer delete = personService.delete(id);
        return "SR/PersonServlet/findAll";
        //response.sendRedirect(request.getContextPath()+"/PersonServlet/findAll");
    }

    public String add(HttpServletRequest request,HttpServletResponse response)throws Exception{
        String username = request.getParameter("username");
        Integer age =Integer.parseInt(request.getParameter("age")) ;
        Integer integer = personService.addStudent(new Person(null, username, age));
        return "SR/PersonServlet/findAll";
        //response.sendRedirect(request.getContextPath()+"/PersonServlet/findAll");
    }

    public String findById(HttpServletRequest request,HttpServletResponse response)throws Exception{
        Integer id = Integer.parseInt(request.getParameter("id"));
        Person byId = personService.findById(id);
        request.setAttribute("user",byId);
        return "RD/update.jsp";
    }

    public String update(HttpServletRequest request,HttpServletResponse response)throws Exception{
       Integer age = Integer.parseInt(request.getParameter("age"));
        Integer id = Integer.parseInt(request.getParameter("id"));
        String name = request.getParameter("name");;
 /*       System.out.println(name);
        System.out.println(age);*/
        Integer update = personService.update(new Person(id,name,age));
        return "SR/PersonServlet/findAll";
    }
}
