<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<h2>${tilte}</h2>
	<h2>${desc}</h2>

	<h2>Form submited succesfully</h2>

	<h3>Your email is ${user.email}</h3>
	<h3>Your password is ${user.password}</h3>
	<h3>Your name is ${user.name}</h3>
</body>
</html>