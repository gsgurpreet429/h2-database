package com.gurpreet.h2.api.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gurpreet.h2.api.model.Employee;

public interface EmployeeRespository extends JpaRepository<Employee, Integer>{

	List<Employee> findAllByDept(String dept);

}
