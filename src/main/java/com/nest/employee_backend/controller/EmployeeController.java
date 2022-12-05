package com.nest.employee_backend.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {
    @GetMapping("/")
    public String HomePage()
    {
        return  "welcome to employee home page";
    }
    @PostMapping("/add")
    public String AddPage()
    {
        return  "welcome to employee add page";
    }
    @PostMapping("/search")
    public String SearchPage()
    {
        return  "welcome to employee search page";
    }
    @PostMapping("/edit")
    public String EditPage()
    {
        return  "welcome to employee edit page";
    }
    @GetMapping("/viewall")
    public String ViewPage()
    {
        return  "welcome to employee view page";
    }
    @PostMapping("/delete")
    public String DeletePage()
    {
        return  "welcome to employee delete page";
    }
}
