<!DOCTYPE HTML>
<html xmlns:th="http://www.thymeleaf.org">
<head>
    <title>Getting Started: Serving Web Content</title>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
</head>
<body>
<h1>Customer Details</h1>
    <p>
    Id: ${customer.getId()}
    Name: ${customer.getName()}
    Age: ${customer.getAge()}
    </p>
</body>
</html>