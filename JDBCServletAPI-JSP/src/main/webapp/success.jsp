<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
    
    <%@ page import="shubha.entity.*" %>
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>OUTPUT PAGE</title>
</head>
<body>
			<h1 style=' color:green;text-align:center;'>
				EMPLOYEE DATA			
			</h1>
			
			
			<%Employee emp =(Employee)request.getAttribute("employee"); %>
			
			
			<table border='2' align="center">
			<tr>
			<th>EMP NO</th>
			<th>EMP NAME</th>
			<th>EMP AGE</th>
			<th>EMP ADDRESS</th>
			</tr>
			
			<tr>
			<td><%=emp.getEid() %></td>
			<td><%=emp.getEname() %></td>
			<td><%=emp.getEage() %></td>
			<td><%=emp.getEaddress() %></td>
			</tr>
			
			</table>
</body>
</html>