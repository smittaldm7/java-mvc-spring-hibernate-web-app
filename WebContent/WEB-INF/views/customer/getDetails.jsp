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
	<h1>Enter Id of customer you want to display</h1>

	<form action="${pageContext.request.contextPath}/customer/displaydetails" method="post">
		<input type="number" name="id"/><br>
		<input type="submit" value="get details">
	</form>
</body>
</html>


