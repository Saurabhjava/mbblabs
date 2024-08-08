<%@page import="com.mbb.dto.User"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<jsp:include page="index.jsp"></jsp:include>
	<h1>Admin Page!</h1>
	<table border="1">
		<%-- <%
		List<User> users = (List<User>) request.getAttribute("userlist");
		for (User u : users) {
		%>
		<tr>
			<td><%=u.getUid()%></td>
			<td><%=u.getName()%></td>
			<td><%=u.getPassword()%></td>
			<td><%=u.getEmail()%></td>
			<td><%=u.getRole()%></td>
		</tr>
		<%
		}
		%> --%>
		<c:forEach var="u" items="${userlist}">
			<c:choose>
				<c:when test="${u.role eq 'admin'}">
					<tr style="background-color: green">
						<td>${u.uid}</td>
						<td>${u.name}</td>
						<td>${u.password}</td>
						<td>${u.email}</td>
						<td>${u.role}</td>
					</tr>
				</c:when>
				<c:otherwise>
					<tr>
						<td>${u.uid}</td>
						<td>${u.name}</td>
						<td>${u.password}</td>
						<td>${u.email}</td>
						<td>${u.role}</td>
					</tr>
				</c:otherwise>
			</c:choose>
		</c:forEach>
	</table>
</body>
</html>