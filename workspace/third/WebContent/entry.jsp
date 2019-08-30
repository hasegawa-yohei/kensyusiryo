<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>

<body>
<form action = "uranai"method="POST">
<h1>占いアプリケーション</h1>

			氏名
			<input type="text"name = "name">
		<table>
	    <tbody>
		<tr>
			<td>生年月日</td>
			<td><select name="year">
			<%for(int i=1900;i<=2019;i++){ %>
			<option value="<%=i %>"><%=i %>
			<% }%>
			</option>
			</select></td>
			<td>年</td>
			<td><select name="month">
			<%for(int i=1;i<=12;i++){ %>
			<option value="<%=i %>"><%=i %>
			<% }%>
			</option>
			</select></td>
			<td>月</td>
			<td><select name="date">
			<%for(int i=1;i<=31;i++){ %>
			<option value="<%=i %>"><%=i %>
			<% }%>
			</option>
			</select></td>
			<td>日</td>
		</tr>
		<tr>

			<td><input type="submit"value="占う" ></td>
		</tr>
	</tbody>
</table>
</form>
</body>
</html>