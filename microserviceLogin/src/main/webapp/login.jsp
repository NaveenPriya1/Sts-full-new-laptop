<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login Page</title>
</head>
<body>
<h3>Login Page</h3>
<form action="login"><fieldset>
<legend>login</legend>
username : <input type="text" name="user" placeholder="enter username"><br><br>
password : <input type="password" name="pwd" placeholder="enter password"><br><br>
<input type="submit" value="login">
</fieldset></form>
<h4>if not a registred user please register first</h4>
<form action="register.jsp">
<input type="submit" value="register">
</form>

</body>
</html>