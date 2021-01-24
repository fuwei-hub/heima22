package cn.itcast.dao;

import cn.itcast.domain.Employee;

import java.util.List;

public interface EmployeeDao {

    List<Employee> findAll()throws Exception;
}
