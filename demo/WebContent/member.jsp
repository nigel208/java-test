<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>success</title>
</head>
<body>
	<%
		String name = request.getParameter("name");
	%>
	<%
		out.print("welcome " + name);
	%>
	<br>time is
	<%=java.util.Calendar.getInstance().getTime()%>

</body>
</html>