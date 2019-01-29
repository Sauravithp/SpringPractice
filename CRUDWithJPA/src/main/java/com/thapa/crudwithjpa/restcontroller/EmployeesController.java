package com.thapa.crudwithjpa.restcontroller;

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
    public ResponseEntity<List> getAll() {
        return new ResponseEntity<List>(employeeService.getAll(), HttpStatus.OK);
    }

    @PostMapping(value = "/employee")
    public void insert(@RequestBody Employee employee) {
        employeeService.insert(employee);
    }

    @DeleteMapping(value = "/employee/{id}")
    public void delete(@PathVariable("id") int id) {
        employeeService.deleteById(id);
    }
}
