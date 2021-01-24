package cn.itcast.service;

import cn.itcast.domain.Person;

import java.util.List;

public interface PersonService {

    List<Person>findAll()throws Exception;

    Integer delete(Integer id)throws Exception;

    Integer addStudent(Person person)throws Exception;

    Person findById(Integer id)throws Exception;

    Integer update(Person person)throws Exception;
}
