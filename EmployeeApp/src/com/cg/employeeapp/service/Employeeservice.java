package com.cg.employeeapp.service;

import java.util.List;

import com.cg.employeeapp.dto.Employee;
import com.cg.employeeapp.exception.EmployeeException;


public interface Employeeservice {
	List<Employee>getEmployees() throws EmployeeException;
}
