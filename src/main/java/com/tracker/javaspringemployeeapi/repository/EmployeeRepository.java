package com.tracker.javaspringemployeeapi.repository;

import com.tracker.javaspringemployeeapi.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {

}
