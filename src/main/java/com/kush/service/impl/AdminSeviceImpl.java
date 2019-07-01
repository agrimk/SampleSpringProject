package com.kush.service.impl;

import com.kush.model.Employee;
import com.kush.service.AdminService;
import org.springframework.stereotype.Service;

@Service
public class AdminSeviceImpl implements AdminService {

    public Employee getEmployee (String userId, String name) {
        Employee employee = new Employee();
        employee.setId("1"); employee.setName("agrim"); employee.setPassword("test");
        return employee;
    }

    public boolean inputEmployee (String userId, String name, String password) {
    return true;
    }
}
