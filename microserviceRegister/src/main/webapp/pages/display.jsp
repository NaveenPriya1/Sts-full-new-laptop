<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page import="com.example.demo.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Display</title>
</head>
<body>
<h3>display page</h3>
<% Student s = (Student)request.getAttribute("studentobj");%>
<h3>registration successful mr<% s.getSuser(); %>
</h3>
</body>
</html>