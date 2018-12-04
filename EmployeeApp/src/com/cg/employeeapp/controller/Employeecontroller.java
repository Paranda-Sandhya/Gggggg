package com.cg.employeeapp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.cg.employeeapp.dto.Employee;
import com.cg.employeeapp.exception.EmployeeException;
import com.cg.employeeapp.service.Employeeservice;

@Controller
public class Employeecontroller {
@Autowired
Employeeservice employeeservice;
@RequestMapping("/")
public ModelAndView showIndex()
{
	ModelAndView mv = new ModelAndView("index");
try
{
	List<Employee> employees=employeeservice.getEmployees();
	mv.addObject("employees",employees);	
}
catch(EmployeeException ex)
{
	ex.printStackTrace();
}

return mv;
}




} 


