<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title> Home page</title>
</head>
<body>
	<h1>This is home page</h1>
	<% String name= (String)request.getAttribute("name"); %>
	<h2>The name is <%= name %></h2>
</body>
</html>