<%@page import="springmodelview.Student"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
      <%@page import="springmodelview.*" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<% Student s = (Student)request.getAttribute("objectname"); %>
<table border="1">
<th>Sid</th>
<tr><td><%= s.getId() %></td></tr>
</table>
</body>
</html>