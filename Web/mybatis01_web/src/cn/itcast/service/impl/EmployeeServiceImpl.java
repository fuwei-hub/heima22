package cn.itcast.service.impl;

import cn.itcast.dao.EmployeeDao;
import cn.itcast.dao.impl.EmployeeDaoImpl;
import cn.itcast.domain.Employee;
import cn.itcast.service.EmployeeService;

import java.util.List;

public class EmployeeServiceImpl implements EmployeeService {

    private EmployeeDao employeeDao=new EmployeeDaoImpl();

    @Override
    public List<Employee> findAll() throws Exception {
     return employeeDao.findAll();
    }
}
