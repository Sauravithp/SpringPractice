package com.thapa.crud.service;

import com.thapa.crud.Employee;
import org.springframework.stereotype.Service;

import java.util.List;

public interface EmployeeDAO {
    List<Employee> getAll();
    boolean insert(Employee e);
    Employee getById(int id);
    boolean delete(int id);
}
