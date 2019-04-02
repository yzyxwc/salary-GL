package com.aqgy.firstweb.dao;

import com.aqgy.firstweb.entities.Department;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;



@Repository
public interface DepartmentDao extends JpaRepository<Department,Integer> {


	
}
