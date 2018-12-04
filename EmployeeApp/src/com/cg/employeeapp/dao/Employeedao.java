package com.cg.employeeapp.dao;

import java.util.List;

import com.cg.employeeapp.dto.Employee;
import com.cg.employeeapp.exception.EmployeeException;



public interface Employeedao {
	List<Employee>getEmployees() throws EmployeeException;
}
