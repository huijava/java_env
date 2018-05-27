<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>查询结果</title>
</head>
<body>
	<center>
		<h1>查询结果</h1>
		<table border="1" width="50%" style="text-align: center;">
			<tr>
				<td>id</td>
				<td>姓名</td>
				<td>性别</td>
				<td>年龄</td>
			</tr>
			<tr>
				<td>${id}</td>
				<td>${name}</td>
				<td>${gender}</td>
				<td>${age}</td>
			</tr>
		</table>
	</center>
</body>
</html>