package com.aqgy.firstweb.dao;

import com.aqgy.firstweb.entities.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;



@Repository//继承jpa的抽象类，并扩展实现的SQL
public interface EmployeeDao extends JpaRepository<Employee,Integer> ,JpaSpecificationExecutor<Employee>{



}
