<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%!
     int count = 0;
    int getcount(){
    	return ++count;
    }
%>
<% out.print("Welcome "+request.getParameter("user")); %>
<h1>visitors to the page</h1>
<%= getcount()   %>
</body>
</html>