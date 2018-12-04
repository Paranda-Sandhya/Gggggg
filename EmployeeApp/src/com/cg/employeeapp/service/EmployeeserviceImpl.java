package com.cg.employeeapp.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.employeeapp.dao.Employeedao;
import com.cg.employeeapp.dto.Employee;
import com.cg.employeeapp.exception.EmployeeException;
@Service
@Transactional
public class EmployeeserviceImpl implements Employeeservice {
@Autowired
Employeedao employeeDao;
	@Override
	public List<Employee> getEmployees() throws EmployeeException {
		return employeeDao.getEmployees();
	}

}
