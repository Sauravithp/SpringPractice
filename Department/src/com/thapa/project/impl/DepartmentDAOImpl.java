/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.thapa.project.impl;

import com.thapa.project.dao.DepartmentDAO;
import com.thapa.project.entity.Department;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author thapaniwas
 */
public class DepartmentDAOImpl implements DepartmentDAO {

    private List<Department> deptlist = new ArrayList<>();

    @Override
    public boolean insert(Department d) {
        return deptlist.add(d);
    }

    @Override
    public Department getById(int Id) {
        for (Department d : deptlist) {
            if (d.getId() == Id) {
                return d;
            }
        }
        return null;
    }

    @Override
    public boolean delete(int Id) {
        Department d=getById(Id);
       
            if (d!=null) {
                return deptlist.remove(d);
            }
        
        return false;
    }

    @Override
    public List<Department> getAll() {
        return deptlist;

    }
}
