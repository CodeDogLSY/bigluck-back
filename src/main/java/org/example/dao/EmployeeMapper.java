package org.example.dao;

import org.apache.ibatis.annotations.Mapper;
import org.example.model.Employee;

import java.util.List;

@Mapper
public interface EmployeeMapper {
    List<Employee> getAllEmployees();
}