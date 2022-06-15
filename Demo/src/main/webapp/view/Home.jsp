<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <%@ page import="com.atcs.demo.model.Employee" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>Your Details is Successfully Submit!!</h1>
<%out.println("Your Details are:"); %>
<% Employee name=(Employee)request.getAttribute("employee");
out.println("ID: "+name.getId()+" ");
out.println("NAME: "+name.getName()+" ");
out.println("SALARY: " +name.getSalary()+" ");
out.println("AGE: "+name.getAge()+" ");
%>
<%// Object age=request.getAttribute("key2");
//out.println("AGE: "+age);
//%>
</body>
</html>