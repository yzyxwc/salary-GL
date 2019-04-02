package com.aqgy.firstweb.service;

import com.aqgy.firstweb.dao.DepartmentDao;
import com.aqgy.firstweb.entities.Department;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Calendar;
import java.util.Collection;

/**
 * @author wc
 */
@Service
@Transactional(rollbackFor = Exception.class)
public class DepartmentService {
    @Autowired
    DepartmentDao departmentDao;

    public Collection<Department> getDepartments() {
        return departmentDao.findAll();
    }
    @Scheduled(cron = "40 * * * * *")
    public  void testScheduled(){
        System.err.println("开始测试。。。"+ Calendar.getInstance().getTimeInMillis());
    }
}
