package com.thapa.crud.service.impl;

import com.thapa.crud.Employee;
import com.thapa.crud.service.EmployeeDAO;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class EmployeeImpl implements EmployeeDAO {

    //This is a bad practise, 
    //If possible, don't initialize objects globally.
    List<Employee> employees = new ArrayList<Employee>();

    public List<Employee> getAll() {
        return employees;
    }
    
    // *Alternatively the code can be written something like this * //
//     private List<Employee> employees;
//     public List<Employee> getAll(){
//         if(employees == null){
//             return new ArrayList<Employee>();
//         }
//         return employees;
//     }

    public boolean insert(Employee e) {
        return employees.add(e);
    }

    public Employee getById(int id) {
        for (Employee employee : employees) {
            if (employee.getId() == id)
                return employee;
        }
        //DON'T DO THIS, INSTEAD THROW EXCEPTIONS
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
