<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form action="LoginRegister" method="post">
		<table>
			<tr>
				<td>username:</td>
				<td><input type="text" name="uname"></td>
			</tr>

			<tr>
				<td>name:</td>
				<td><input type="text" name="mname"></td>
			</tr>
			<tr>
				<td>pass:</td>
				<td><input type="password" name="pass"></td>
			</tr>

			<tr>
				<td>re type pass:</td>
				<td><input type="password" name="rpass"></td>
			</tr>
			<tr>
				<td><a href=regis.jsp" ></a></td>
				<td><input type="submit" name="subm" value="regis"></td>
			</tr>
		</table>
	</form>

</body>
</html>