package com.example.hibernatespringdatajpademo.jpademo.repository;

import com.example.hibernatespringdatajpademo.jpademo.domain.entity.Department;
import jakarta.transaction.Transactional;

import java.util.List;

public interface DepartmentRepository {

    void save(Department department);

    List<Department> findAll();

    Department findById(int id);

    Department findByIdJoinFetch(int theId);

    void update(Department department);

    void delete(int id);

  //  int deleteAll();
}
