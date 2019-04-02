package com.aqgy.firstweb.controller;

import com.aqgy.firstweb.entities.Department;
import com.aqgy.firstweb.entities.Employee;
import com.aqgy.firstweb.service.DepartmentService;
import com.aqgy.firstweb.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;

@Controller
public class EmployeeController {
    @Autowired
    EmployeeService employeeService;
    @Autowired
    DepartmentService departmentService;

    @GetMapping("/emps")
    public String list(Model model){
        Collection<Employee> all = employeeService.getAll();
        model.addAttribute("emps",all);
        return "emp/list.html";
    }
    @GetMapping("/emp")
    public String toAddPage(Model model){
        Collection<Department> departments = departmentService.getDepartments();
        model.addAttribute("deps",departments);
        return "emp/add";

    }
    @PostMapping("/emp")
    public String addEmployee(Employee employee){
        employeeService.save(employee);
        return "redirect:/emps";
    }
    @GetMapping("/emp/{id}")
    public String updateSelEmployee(@PathVariable("id") Integer id,Model model){
        Employee employee = employeeService.get(id);
        Collection<Department> departments = departmentService.getDepartments();
        model.addAttribute("deps",departments);
        model.addAttribute("emp",employee);
        return "emp/add";
    }
    @PutMapping("/emp")
    public String updateEmployee(Employee employee){
        employeeService.save(employee);
        return "redirect:/emps";
    }
    @DeleteMapping("/emp/{id}")
    public  String deleteEmployee(@PathVariable("id") Integer id){
        employeeService.delete(id);
        return "redirect:/emps";
    }
}
