package com.thapa.crud;

import com.thapa.crud.service.EmployeeDAO;
import com.thapa.crud.service.impl.EmployeeImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.List;

@Controller
public class CrudController {


    private EmployeeDAO employeeDAO;



    @Autowired
    public void setEmployeeDAO(EmployeeDAO employeeDAO) {
        this.employeeDAO = employeeDAO;
    }

    @RequestMapping(value = "/")
    public ModelAndView homepage(){
        ModelAndView mv =new ModelAndView();
        mv.setViewName("home");
        return mv;
    }
    @RequestMapping(value = "/insert",method = RequestMethod.POST)
    public ModelAndView form(@ModelAttribute ("emp") Employee emp, BindingResult result){
        ModelAndView mv =new ModelAndView();
        employeeDAO.insert(emp);
        mv.setViewName("result");
        return mv;
    }

    @RequestMapping(value = "/getall",method = RequestMethod.POST)
    public ModelAndView showall(){
        ModelAndView mv =new ModelAndView();
        mv.addObject("EmpInfo",employeeDAO.getAll());
        mv.setViewName("getall");
        return mv;
    }

    @RequestMapping(value = "/delete",method = RequestMethod.POST)
    public ModelAndView delete(@RequestParam ("id") int id){
        ModelAndView mv =new ModelAndView();
        employeeDAO.delete(id);
        mv.setViewName("delete");
         return mv;

    }

    @ResponseBody
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

}
