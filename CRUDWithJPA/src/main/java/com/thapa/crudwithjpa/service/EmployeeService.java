package com.thapa.crudwithjpa.service;

import com.thapa.crudwithjpa.entity.Employee;

import java.util.List;

public interface EmployeeService {
    List<Employee> getAll();

    void insert(Employee employee);

    void deleteById(int id);
}
