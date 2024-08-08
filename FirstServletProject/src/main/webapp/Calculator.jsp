<%@page import="com.service.CalculatorService"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form action="Calculator.jsp">
		<table>
			<tr>
				<td>Number1:</td>
				<td><input type="text" name="t1" /></td>
			</tr>
			<tr>
				<td>Number2:</td>
				<td><input type="text" name="t2" /></td>
			</tr>
			<tr>
				<td><input type="submit" value="Add" name="b1"></td>
				<td><input type="submit" value="Sub" name="b1"></td>
			</tr>
		</table>
	</form>

	<%!CalculatorService cal = new CalculatorService();%>
	<%
	String num1 = request.getParameter("t1");
	String num2 = request.getParameter("t2");
	int result=0;
	if (num1!=null && num2!=null && (num1.matches("\\d+") && num2.matches("\\d+"))) {
		int x = Integer.parseInt(num1);
		int y = Integer.parseInt(num2);
		String btn = request.getParameter("b1");
		if (btn.equals("Add"))
			result=cal.add(x, y);
		else if (btn.equals("Sub"))
			result=cal.sub(x, y);
	}
	%>
	<h2>Result=<%= result %></h2>
</body>
</html>