package com.deepak.service;

import com.deepak.entity.Employee;
import com.deepak.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService {

    //@Autowired
    EmployeeRepository employeeRepository;

    public Employee createEmployee(Employee employee) {
        return employeeRepository.save(employee);
    }

    public List<Employee> getAllEmployees() {
        return employeeRepository.findAll();
    }

    public Employee getEmpolyeeById(String id) {
        return employeeRepository.findById(id).orElse(null);
    }

    public void deleteEmployee(String id) {
        employeeRepository.deleteById(id);
    }
}