package com.kush.controller;

import com.kush.model.Employee;
import com.kush.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

@RestController
@EnableAutoConfiguration
public class AdminController {

    @Autowired
    AdminService adminService;

    @RequestMapping("/inputEmployee")
    public boolean inputEmployee(HttpServletRequest httpRequest)
    {
        return adminService.inputEmployee(httpRequest.getParameter("userId"),
                httpRequest.getParameter("name"),
                httpRequest.getParameter("password"));
    }

    @RequestMapping("/getEmployee/{userId}/{name}")
    public Employee getEmployee(HttpServletRequest httpRequest, @PathVariable String userId, @PathVariable String name) {
        return adminService.getEmployee(userId, name);
    }
}
