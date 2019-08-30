<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<jsp:useBean id="result" scope="request" class="web.ResultBean"/>
<!DOCTYPE html>
<html>
<head>

</head>
<body>
<h1><%= request.getParameter("name")%>さんの運勢</h1>
<table border>
<tr>
<td>金運</td>
<td><jsp:getProperty name="result" property="money"/></td>
</tr>
<tr>
<td>恋愛運</td>
<td><jsp:getProperty name="result" property="love"/></td>
</tr>
<tr>
<td>仕事運</td>
<td><jsp:getProperty name="result" property="work"/></td>
</tr>
<tr>
<td>健康運</td>
<td><jsp:getProperty name="result" property="health"/></td>
</tr>
<tr>
<td>全体運</td>
<td><jsp:getProperty name="result" property="total"/></td>
</tr>
</table>

</body>
</html>