<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ page import="model.Emp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
 HttpSession ses = request.getSession();
	Emp emp =(Emp) ses.getAttribute("emp");
%>
<h1> ID : <%=emp.getId() %></h1>
<h1> Name : <%=emp.getName() %></h1>
<h1>Dipartment :<%=emp.getDepartment()%></h1>

<h1> Salary :<%=emp.getSalary() %></h1>
</body>

</html>