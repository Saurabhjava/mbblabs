<%@page import="com.mbb.dto.User"%>
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
	<%
		User u=(User)session.getAttribute("user");
		if(u!=null) {
	%>	
	<h1>Your Profile</h1>
	<table border="1">
		<tr>
			<td>Name</td><td>${user.name}</td>
		</tr>
		<tr>
			<td>Password</td><td>${user.password}</td>
		</tr>
		<tr>
			<td>Email</td><td>${user.email}</td>
		</tr>
		<tr>
			<td>Role</td><td>${user.role}</td>
		</tr>
	</table>
	<%
		} else {
	%>
	<h1>Please Login To Access Profile</h1>
	<% } %>
</body>
</html>