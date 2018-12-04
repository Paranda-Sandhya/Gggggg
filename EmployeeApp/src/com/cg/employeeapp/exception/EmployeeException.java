package com.cg.employeeapp.exception;

public class EmployeeException extends Exception{
	

			public String msg;
			public EmployeeException(String msg) {
				this.msg = msg;
			}
			
			public String getMessage() {
				return msg;
			}
		} 
		 


