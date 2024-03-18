package com.example.hibernatespringdatajpademo.jpademo.repository;

import com.example.hibernatespringdatajpademo.jpademo.domain.entity.Department;
import com.example.hibernatespringdatajpademo.jpademo.domain.entity.Employee;

import java.util.List;

public interface EmployeeRepository {
    void save(Employee employee);

    List<Employee> findAll();

    Employee findById(int id);

    List<Employee> findEmployeeByMinAgeAndDepartment(int minAge, String departmentName);

    void update(Employee employee);

    void delete(int id);

}
