<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page session="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>Add a customer to the database</h1>

	<form action="${pageContext.request.contextPath}/customer/create" method="post">
		Name:<input type="text" name="name"/><br>
		Age:<input type="number" name="age"/><br>
		
		<input type="submit" value="Add Customer">
	</form>
</body>
</html>



