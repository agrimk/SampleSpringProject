package com.kush.repository;

import com.kush.model.Employee;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;
//
//@Repository
//public class EmployeeRepository extends CrudRepository<Employee, Long> {
//
//    @Override
//    public <S extends Employee> S save(S s) {
//        return null;
//    }
//
//    @Override
//    public <S extends Employee> Iterable<S> saveAll(Iterable<S> iterable) {
//        return null;
//    }
//
//    @Override
//    public boolean existsById(Long aLong) {
//        return false;
//    }
//
//    @Override
//    public Iterable<Employee> findAll() {
//        return null;
//    }
//
//    @Override
//    public Iterable<Employee> findAllById(Iterable<Long> iterable) {
//        return null;
//    }
//
//    @Override
//    public long count() {
//        return 0;
//    }
//
//    @Override
//    public void deleteById(Long aLong) {
//
//    }
//
//    @Override
//    public void delete(Employee employee) {
//
//    }
//
//    @Override
//    public void deleteAll(Iterable<? extends Employee> iterable) {
//
//    }
//
//    @Override
//    public void deleteAll() {
//
//    }
//
//    @Override
//    public Optional<Employee> findById(Long aLong) {
//        return Optional.empty();
//    }
//}
