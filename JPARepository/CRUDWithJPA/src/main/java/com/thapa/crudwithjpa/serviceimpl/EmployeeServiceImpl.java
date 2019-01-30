package com.thapa.crudwithjpa.serviceimpl;

import com.thapa.crudwithjpa.entity.Employee;
import com.thapa.crudwithjpa.repository.EmployeeRepository;
import com.thapa.crudwithjpa.service.EmployeeService;
import com.thapa.crudwithjpa.utility.QueryCreater;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
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
