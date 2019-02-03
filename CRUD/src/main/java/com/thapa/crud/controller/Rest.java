package com.thapa.crud.controller;

import com.thapa.crud.dao.EmployeeDAO;
import com.thapa.crud.entity.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class Rest {

    @Autowired
    private EmployeeDAO employeeDAO;

    @RequestMapping(value = "/insert", method = RequestMethod.POST)
    public void form(@RequestBody Employee employee) {
        employeeDAO.insert(employee);
    }

    @RequestMapping(value = "/getall", method = RequestMethod.GET)
    public ResponseEntity<List> showall() {
        return new ResponseEntity<List>(employeeDAO.getAll(), HttpStatus.OK);
    }

    @RequestMapping(value = "/delete/{id}", method = RequestMethod.DELETE)
    public void delete(@PathVariable("id") int id) {
        employeeDAO.delete(id);
        System.out.println("Data is deleted");

    }


}
