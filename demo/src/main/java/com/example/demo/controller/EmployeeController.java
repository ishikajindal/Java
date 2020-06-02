package com.example.demo.controller;

import com.example.demo.entity.Employee;
import com.example.demo.service.EmployeeServiceImpl;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;


@RestController
@RequestMapping("/employee")
@Slf4j
public class EmployeeController {

@Autowired
private EmployeeServiceImpl employeeService;

@PostMapping("/add/emp")
public Employee createEmployee(@Valid @RequestBody Employee emp) {
    return employeeService.createEmployee(emp);
}

@GetMapping("/all/emp")
public List<Employee> getAllEmployee() {
    return employeeService.getAllEmployee();
}

@GetMapping("")
public String sayHello() {
    return "Hello";
}
}
