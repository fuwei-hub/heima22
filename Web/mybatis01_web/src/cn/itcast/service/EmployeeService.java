package cn.itcast.service;

import cn.itcast.domain.Employee;

import java.util.List;

public interface EmployeeService {

    List<Employee> findAll()throws Exception;
}
