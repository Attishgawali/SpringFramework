<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page isELIgnored = "false" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h2>This is help JSP</h2>
	
	<%-- <%
		String name =(String)request.getAttribute("name");
		Integer rollno = (Integer)request.getAttribute("rollno");
	%>
	<h2>My Name is : <%= name %></h2>
	<h2>My rollno is : <%= rollno %></h2> --%>
	
	<h2>My name is ${name}</h2>
	<h2>RollNumber is ${rollno}</h2>
	
	<c:forEach var="item" items="${marks}">
		<h1>${item}</h1>
	</c:forEach>
</body>
</html>