package com.thapa.crud.service;

import com.thapa.crud.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.List;

@RestController
public class Rest {


    private EmployeeDAO employeeDAO;
    int id;


    @Autowired
    public void setEmployeeDAO(EmployeeDAO employeeDAO) {
        this.employeeDAO = employeeDAO;
    }

    @GetMapping(value = "/employee")
    public List<Employee> getEmployeeList(){

        List<Employee> empList=new ArrayList<Employee>();

        Employee employee1=new Employee();
        employee1.setId(1);
        employee1.setName("Sauravi");
        employee1.setContact("4414450");
        employee1.setAddress("Baluwatar");

        Employee employee2=new Employee();
        employee2.setId(2);
        employee2.setName("Saru");
        employee2.setContact("9865783425");
//    employee2.setAddress("jawalakhel");

        empList.add(employee1);
        empList.add( employee2);

        return empList;

    }

    //    using @PathVariable to retrive employees data

    @GetMapping(value = "/employee/{name}")
    public Employee getEmployee(@PathVariable("name") String name, @PathVariable ("id") int id){



        Employee employee=new Employee();
        employee.setName(name);
        employee.setId(id);


        return employee;

    }

@PutMapping(value = "/employee/{name}")
public boolean updateEmployee(@PathVariable("name") String name, @RequestBody Employee employee){

    System.out.println("Employee Name:"+name);
    System.out.println("Employee Name:"+employee.getName()+"Employee id"+employee.getId()+"Employee Contact"+employee.getContact()+"Employee Address"+employee.getAddress());
    return true;

}
    @RequestMapping(value = "/insert",method = RequestMethod.POST)
    public ResponseEntity<Boolean> form(@RequestBody Employee employee){
        employeeDAO.insert(employee);
        return new ResponseEntity<Boolean>(true, HttpStatus.CREATED);
    }

    @RequestMapping(value = "/getall",method = RequestMethod.GET)
    public List<Employee> showall(){
       return employeeDAO.getAll();
    }

        @RequestMapping(value = "/delete", method = RequestMethod.DELETE)
    public void delete(@RequestBody int id){
                employeeDAO.delete(id);
        System.out.println("Data is deleted");

    }


}
