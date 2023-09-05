<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page isELIgnored = "false" %>
 <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>File Upload</title>
</head>
<body>
	<h2>File Upload status</h2>
	<h2>${msg}</h2>
	<img alt="Uploaded Image" src="<c:url value='/resources/images/${filename}' />" />
</body>
</html>