package com.cg.employeeapp.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import org.springframework.stereotype.Repository;

import com.cg.employeeapp.dto.Employee;
import com.cg.employeeapp.exception.EmployeeException;
@Repository
public class EmployeeDaoImpl implements Employeedao {
	@PersistenceContext
	EntityManager entityManager;
	@Override
	public List<Employee> getEmployees() throws EmployeeException {
		try{
		TypedQuery<Employee> query=entityManager.createQuery("from Employee", Employee.class);
				return query.getResultList();
		} catch(Exception e)
		{
			throw new EmployeeException(e.getMessage());
		}
	}
}