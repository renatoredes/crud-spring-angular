package br.com.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.api.model.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {

}
