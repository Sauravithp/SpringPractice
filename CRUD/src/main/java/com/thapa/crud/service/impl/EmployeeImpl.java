package com.thapa.crud.service.impl;

import com.thapa.crud.Employee;
import com.thapa.crud.service.EmployeeDAO;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

// IF THIS IS YOUR INTENDED REPOSITORY CLASS, YOU CAN USE '@Repository' HERE INSTEAD OF '@Component'
@Component
public class EmployeeImpl implements EmployeeDAO {

    List<Employee> employees = new ArrayList<Employee>();


    public List<Employee> getAll() {
        return employees;
    }

    public boolean insert(Employee e) {
        return employees.add(e);
    }

    public Employee getById(int id) {
        for (Employee employee : employees) {
            if (employee.getId() == id)
                return employee;
        }
        return null;
    }

    public boolean delete(int id) {
        Employee emp = getById(id);
        if (emp != null) {
            System.out.println("Deleted");
            employees.remove(emp);
        }
        return false;
    }
}
