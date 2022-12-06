package com.nest.employee_backend.controller;

import com.nest.employee_backend.dao.EmployeeDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.nest.employee_backend.model.Employees;

@RestController
public class EmployeeController {
    @Autowired
    private EmployeeDao dao;
    @GetMapping("/")
    public String HomePage()
    {
        return  "welcome to employee home page";
    }
    @PostMapping(path="/add",consumes = "application/json",produces = "application/json")
    public String AddEmployee(@RequestBody Employees e)
    {
        System.out.println(e.getId());
        System.out.println(e.getEmpcode());
        System.out.println(e.getDesignation());
        System.out.println(e.getSalary());
        System.out.println(e.getCompanyName());
        System.out.println(e.getMobno());
        System.out.println(e.getUsername());
        System.out.println(e.getPassword());
        dao.save(e);
        return  "employee added successfully";
    }

}
