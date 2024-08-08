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
<h2 style="color: red">${msg}</h2>
	<form action="LoginController" method="post">
	<h1 align="center">Login Page</h1>
		<table align="center">
			<tr>
				<td>UserId</td>
				<td><input type="text" name="t1"></td>
			</tr>
			<tr>
				<td>Password</td>
				<td><input type="text" name="t2"></td>
			</tr>
			<tr>
				<td><input type="submit" value="Login"></td>
			</tr>
		</table>
	</form>
</body>
</html>