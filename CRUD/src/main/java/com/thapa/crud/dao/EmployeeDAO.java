package com.thapa.crud.dao;

import com.thapa.crud.entity.Employee;

import java.util.List;

public interface EmployeeDAO {
    List<Employee> getAll();

    boolean insert(Employee e);

    Employee getById(int id);

    boolean delete(int id);
}
