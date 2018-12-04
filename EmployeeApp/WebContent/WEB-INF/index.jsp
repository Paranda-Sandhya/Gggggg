<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib  uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>Employee management system</h1>
<table border="1">
					    
						      <tr>
						        <th>Employee Id</th>
						        <th>Employee Name</th>
						        <th>Gender</th>
						        <th>Age</th>
						        <th>Salary</th>
						         
						      </tr>
					   <c:forEach items="${employees}" var="employee">
						      <tr>
						        <td>${employee.empid}</td>				        
						        <td>${employee.name}</td>
						        <td>${employee.gender}</td>
						        <td>${employee.age}</td>
						        <td>${employee.salary}</td>
						        </tr>
						        </c:forEach>
						      
					    	
						        					        
						        
</table>
</body>
</html>