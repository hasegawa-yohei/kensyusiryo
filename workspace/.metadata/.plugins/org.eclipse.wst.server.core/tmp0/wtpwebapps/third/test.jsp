<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<jsp:useBean id="emp" scope="request" class="web.EmpBean"/>
<!DOCTYPE html>
<html>

<body>
<h1>UseBean</h1>
<table border>
<tr>
<td>Name</td>
<td><jsp:getProperty name="emp" property="name"/></td>
</tr>
<tr>
<td>Age</td>
<td><jsp:getProperty name="emp" property="age"/></td>
</tr>
</table>

</body>
</html>