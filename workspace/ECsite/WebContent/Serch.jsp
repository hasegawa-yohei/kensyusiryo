<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" type="text/css" href="NewFile.css">
<title>検索ページ</title>
</head>
<body>
<form action = "search"method="POST">
<h1><p align="center">検索</p></h1>
<p align="center"><input type size="40"="text" name="name"></p><br>
<p align="center">カテゴリ<select name="category">
<option value="0">指定なし</option>
<option value="1">食品</option>
<option value="2">家電</option>
<option value="3">生活用品</option>
<option value="4">コスメ</option>
<option value="5">ゲーム</option>

</select>
</p>
<p align="center"><button class="button2" type="submit" name="act" value="検索" >Search</button></p>
</p>

<table border="1" width="500" cellspacing="0"align="center" cellpadding="5" bordercolor="black">

<tr>
<th>商品名</th>
<th>価格</th>
<th>詳細</th>
</tr>
<tr>
<td></td>
<td></td>
<td></td>
</tr></form>
<tr>

</form>
</body>
</html>