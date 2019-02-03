package com.thapa.crud.dao.impl;

import com.thapa.crud.entity.Employee;
import com.thapa.crud.dao.EmployeeDAO;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class EmployeeImpl implements EmployeeDAO {

    private List<Employee> employees;

    public EmployeeImpl(List<Employee> employees) {
        this.employees = employees;
    }

    public List<Employee> getAll(){
         if(employees == null){
             return new ArrayList<Employee>();
         }
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
