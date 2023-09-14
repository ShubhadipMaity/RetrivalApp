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
			<h1 style='color: red; text-align: center'>EMPLOYEE DATA</h1>
<% Emp emp1 = (Emp)request.getAttribute("employee");%>
<table border='1' align="center">
<tr>
<th>EID</th>
<th>ENAME</th>
<th>EAGE</th>
<th>EADDRESS</th>
</tr>
<tr>
<td><%=emp1.getEid()%></td>
<td><%=emp1.getEname()%></td>
<td><%=emp1.getEage()%></td>
<td><%=emp1.getEaddress()%></td>
</tr>
</table>
</body>
</html>