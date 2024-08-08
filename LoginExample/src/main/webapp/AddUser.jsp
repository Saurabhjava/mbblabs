<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<jsp:include page="index.jsp"/>
	<form action="UserController" method="post">
	<h1 align="center">New User Form</h1>
		<table align="center">
			<tr>
				<td>Name</td>
				<td><input type="text" name="t1"></td>
			</tr>
			<tr>
				<td>Password</td>
				<td><input type="text" name="t2"></td>
			</tr>
			<tr>
				<td>Email</td>
				<td><input type="text" name="t3"></td>
			</tr>
			<tr>
				<td><input type="submit" value="Add User"></td>
			</tr>
		</table>
	</form>
	<h2>${Result}</h2>
</body>
</html>