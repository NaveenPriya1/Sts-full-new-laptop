<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page import="java.util.*" %>
    <%@ page import="com.example.demo.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<% List<Student> s= (List<Student>) request.getAttribute("stul"); %>
<h3>Students list</h3>
<table border="1">
<tr><th>student id</th><th>student name</th><th>student email</th><th>update</th><th>delete</th></tr>
<% for(Student ss:s) {%>
<tr><td><%= ss.getSid() %></td><td><%= ss.getName() %></td><td><%= ss.getEmail() %></td><td><a href="edit.jsp">edit</a></td><td><a href="delete.jsp">delete</a></td></tr>
<%} %>
</table>
</body>
</html>