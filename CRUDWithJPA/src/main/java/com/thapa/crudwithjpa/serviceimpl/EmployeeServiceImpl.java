package com.thapa.crudwithjpa.serviceimpl;

import com.thapa.crudwithjpa.entity.Employee;
import com.thapa.crudwithjpa.service.EmployeeService;
import com.thapa.crudwithjpa.utility.QueryCreater;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import java.util.List;

@Repository
public class EmployeeServiceImpl implements EmployeeService {

    @PersistenceContext(unitName = "persistence")
    private EntityManager entityManager;

    @Transactional
    public List<Employee> getAll() {
        Query query1 = entityManager.createQuery(QueryCreater.getAll());
        return query1.getResultList();
    }

    @Transactional
    public void insert(Employee e) {
        entityManager.persist(e);
    }


    @Transactional
    public void deleteById(int id) {
        Employee emp = entityManager.find(Employee.class, id);
        if (emp != null) {
            entityManager.remove(emp);
        }

    }

}
