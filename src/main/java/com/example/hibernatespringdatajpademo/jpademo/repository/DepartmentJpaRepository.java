package com.example.hibernatespringdatajpademo.jpademo.repository;

import com.example.hibernatespringdatajpademo.jpademo.domain.entity.Department;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DepartmentJpaRepository extends JpaRepository<Department, Integer> {
}
