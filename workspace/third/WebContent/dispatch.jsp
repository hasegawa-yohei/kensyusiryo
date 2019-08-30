<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">

</head>
<body>
<h1>Dispatched JSP</h1>
session(name) = <%= session.getAttribute("name") %><br>
request(age) = <%= request.getAttribute("age") %>
</body>
</html>