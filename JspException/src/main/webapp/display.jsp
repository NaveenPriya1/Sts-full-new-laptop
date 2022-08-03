<%@page import="org.apache.tomcat.util.descriptor.web.ErrorPage"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page errorPage="user.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%
int num1= Integer.parseInt(request.getParameter("num1"));
int num2= Integer.parseInt(request.getParameter("num2"));
int num3=num1/num2;
out.print("The result is "+num3);
%>
</body>
</html>