package com.thapa.crudwithjpa.controller;

import com.thapa.crudwithjpa.entity.Employee;
import com.thapa.crudwithjpa.service.EmployeeService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class EmployeesController {

    private EmployeeService employeeService;

    public EmployeesController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    @GetMapping(value = "/employees")
    public ResponseEntity<List<Employee>> getAll() {
        return new ResponseEntity<>(employeeService.getAll(), HttpStatus.OK);
    }

    @PostMapping(value = "/employee")
    public void insert(@RequestBody Employee employee) {
        employeeService.insert(employee);
        String exception= "NullPointer Exception";
        if(exception.equals("NullPointer Exception")){
            throw new NullPointerException();
        }
    }

    @DeleteMapping(value = "/employee/{id}")
    public void delete(@PathVariable("id") Long id) {
        employeeService.deleteById(id);
    }
}
