package cn.itcast.controller;

//提供两个功能  一个功能返回一个Person   另外一个返回多个Person

import cn.itcast.core.BaseServlet;
import cn.itcast.core.ResponseBody;
import cn.itcast.domain.Person;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.ArrayList;
import java.util.List;

@WebServlet("/PersonServlet_JSON/*")
public class PersonServlet_JSON extends BaseServlet {
    @ResponseBody
    public Person person(HttpServletRequest request, HttpServletResponse response) {
        Person person = new Person(18, "张三", 23);
        return person;
    }

    @ResponseBody
    public List<Person> persons(HttpServletRequest request, HttpServletResponse response) {
        ArrayList<Person> list = new ArrayList<>();
        Person person1 = new Person(18, "张三", 23);
        Person person2 = new Person(19, "赵四", 24);
        Person person3 = new Person(22, "王五", 25);
        list.add(person1);
        list.add(person2);
        list.add(person3);
        return list;
    }
}

