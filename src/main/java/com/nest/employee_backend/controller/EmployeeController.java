package com.nest.employee_backend.controller;

import com.nest.employee_backend.dao.EmployeeDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.nest.employee_backend.model.Employees;

import java.util.HashMap;
import java.util.List;

@RestController
public class EmployeeController {
    @Autowired
    private EmployeeDao dao;
    @CrossOrigin(origins = "*")
    @GetMapping("/view")
    public List<Employees> HomePage()
    {
        return(List<Employees>) dao.findAll();
    }
    @CrossOrigin(origins = "*")
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
    @CrossOrigin(origins = "*")
    @PostMapping(path="/search",consumes = "application/json",produces = "application/json")
    public List searchEmployee(@RequestBody Employees e){
        String Empcode = String.valueOf(e.getEmpcode());
        System.out.println(Empcode);
        dao.searchEmployee(e.getEmpcode());
        return(List<Employees>)dao.searchEmployee(e.getEmpcode());
    }
    @CrossOrigin(origins = "*")
    @PostMapping(path="/delete",consumes = "application/json",produces = "application/json")
    public HashMap<String,String> deleteEmployee(@RequestBody Employees e)
    {
        String empid = String.valueOf(e.getId());
        System.out.println(empid);
        dao.deleteEmployee(e.getId());
        HashMap<String,String>map=new HashMap<>();
        map.put("status","success");
        return map;
    }

}
