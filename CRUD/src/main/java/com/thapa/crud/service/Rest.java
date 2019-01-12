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
//int id;
    
    

    //ANY REASONS TO @Autowire THE SETTER METHOD (IN PARTICULAR)
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
    //THIS IS BAD FORMATING OF THE CODE ;)
    System.out.println("Employee Name:"+employee.getName()+"Employee id"+employee.getId()+"Employee Contact"+employee.getContact()+"Employee Address"+employee.getAddress());
    return true;

}
    //TRY USING ALT+SHIFT+F EVERY ONCE IN A WHILE
    //DOING SO WILL FORMAT YOUR CODE FOR YOU
    @RequestMapping(value = "/insert",method = RequestMethod.POST)
    public void form(@RequestBody Employee employee) throws Exception{
        employeeDAO.insert(employee);
        //I DIDN'T UNDERSTAND WHY YOU'D DONE THIS?
        //MUST BE A DELIBERATE WAY TO TEST NULL POINTER EXCEPTION ?
        String exception= "NullPointer Exception";
        if(exception.equals("NullPointer Exception")){
            throw new NullPointerException();
        }
    }

    @RequestMapping(value = "/getall",method = RequestMethod.GET)
    public List<Employee> showall(){
       return employeeDAO.getAll();
    }

//    @RequestMapping(value = "/delete/{id}", method = RequestMethod.DELETE)
//    public void delete(@PathVariable ("id") int id){
//                employeeDAO.delete(id);
//        System.out.println("Data is deleted");
//
//    }

    @RequestMapping(value = "/delete", method = RequestMethod.DELETE)
    public void delete(@RequestBody int id) {
                employeeDAO.delete(id);
        System.out.println("Data is deleted");

    }
    
    //NOW THAT YOU'RE DOING @RESTful Webservice, TRY EXPLORING 'ResponseEntity'

    //    @RequestMapping(value = "/delete", method = RequestMethod.DELETE)
//    public void delete(@RequestBody Employee employee){
//                employeeDAO.delete(employee.getId());
//        System.out.println("Data is deleted");
//
//    }

}
