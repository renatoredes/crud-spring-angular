package com.example.crudspring.angula.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.crudspring.angula.api.model.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {

}
