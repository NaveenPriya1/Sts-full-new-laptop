<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<style type="text/css">
#submit {
	background-color: light green
}
</style>
</head>
<body>
	<h2 style="color: red">Spring web mvc</h2>

	<div style="color: blue; margin-left: 300px; margin-right: 300px; margin-top: 70px">
		<form action="first">
			<fieldset style="margin-lef: 50px">
				<legend>My form</legend>
				<div style="text-align: center">
					id <input type="text" name="id" placeholder="Enter id"><br>
					<br> Name <input type="text" name="name"
						placeholder="Enter Name"><br>
					<br> <input type="submit" id="submit">
				</div>
			</fieldset>
		</form>
	</div>
</body>
</html>
