<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>MAIN</title>
</head>
<body>
	<form action="LoginRegister" method="post">
		<table>
			<tr>
				<td><h3>${message}</h3>
					<h3 style="color: green"">${sucm}</h3></td>
			</tr>
			<tr>
				<td>username:</td>
				<td><input type="text" name="uname"></td>
			</tr>
			<tr>
				<td>pass:</td>
				<td><input type="password" name="pass"></td>
			</tr>
			<tr>
				<td><a href="reg.jsp" >register</a></td>
				<td><input type="submit" name="subm" value="login"></td>
			</tr>
		</table>
	</form>
</body>
</html>