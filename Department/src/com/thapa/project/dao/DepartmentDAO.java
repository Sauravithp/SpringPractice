/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.thapa.project.dao;

import com.thapa.project.entity.Department;
import java.util.List;

/**
 *
 * @author thapaniwas
 */
public interface DepartmentDAO {
    boolean insert(Department d);
    Department getById(int Id);
    boolean delete(int Id);
    List<Department>getAll();
}
