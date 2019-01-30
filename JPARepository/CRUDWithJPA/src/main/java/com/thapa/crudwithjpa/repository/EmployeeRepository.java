package com.thapa.crudwithjpa.repository;

import com.thapa.crudwithjpa.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee,Long> {
}
