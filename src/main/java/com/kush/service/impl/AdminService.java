package com.kush.service;

import com.kush.model.Employee;

public interface AdminService {
        public Employee getEmployee (String userId, String name) ;
        public boolean inputEmployee (String userId, String name, String password) ;
    }
