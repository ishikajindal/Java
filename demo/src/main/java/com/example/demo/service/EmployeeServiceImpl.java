package com.example.demo.service;

import com.example.demo.dao.AddressRepo;
import com.example.demo.dao.EmployeeRepo;
import com.example.demo.entity.Address;
import com.example.demo.entity.Employee;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.List;

@Slf4j
@Service
public class EmployeeServiceImpl {

    @Autowired
    private EmployeeRepo employeeRepo;

    @Autowired
    private RestTemplate restTemplate;

    @Autowired
    private AddressRepo addressRepo;

    public Employee createEmployee(Employee emp){
        Address address = addressRepo.findById(emp.getAddress().getAddId()).orElse(null);
        if (null == address) {
            address = new Address();
        }
        address.setCity(emp.getAddress().getCity());
        emp.setAddress(address);
       return employeeRepo.save(emp);
    }

    public List<Employee> getAllEmployee(){
        return employeeRepo.findAll();
    }

}
