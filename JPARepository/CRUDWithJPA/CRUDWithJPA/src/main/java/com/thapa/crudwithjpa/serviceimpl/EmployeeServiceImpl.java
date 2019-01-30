package com.thapa.crudwithjpa.serviceimpl;

import com.thapa.crudwithjpa.entity.Employee;
import com.thapa.crudwithjpa.repository.EmployeeRepository;
import com.thapa.crudwithjpa.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeServiceImpl  implements EmployeeService{

    @Autowired
    private EmployeeRepository employeeRepository;


    public List<Employee> getAll() {
       return employeeRepository.findAll();
    }


    public void insert(Employee e) {
       employeeRepository.save(e);
    }


    public void deleteById(Long id) {
        Employee emp = employeeRepository.findOne(id);
        if (emp != null) {
            employeeRepository.delete(emp);
        }

    }

}
