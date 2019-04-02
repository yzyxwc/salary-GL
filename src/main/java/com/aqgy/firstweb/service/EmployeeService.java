package com.aqgy.firstweb.service;

import com.aqgy.firstweb.dao.EmployeeDao;
import com.aqgy.firstweb.entities.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Collection;

/**
 * @author wc
 */
@Service
@Transactional(rollbackFor = Exception.class)
public class EmployeeService {
    @Autowired
    EmployeeDao employeeDao;

    public Collection<Employee> getAll() {
        return employeeDao.findAll();
    }

    public void save(Employee employee) {
        employeeDao.save(employee);
    }

    public Employee get(Integer id) {
        return  employeeDao.getOne(id);
    }

    public void delete(Integer id) {
        employeeDao.deleteById(id);
    }
}
