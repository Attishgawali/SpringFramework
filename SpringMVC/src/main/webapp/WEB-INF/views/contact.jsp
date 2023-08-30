<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet"
	href="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/css/bootstrap.min.css"
	integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm"
	crossorigin="anonymous">
</head>
<body>
	


	<div class="container m-5">
	<h2>Contact form</h2>
	<h2>${tilte}</h2>
	<h2>${desc}</h2>
	
		<form action="processform" method="post">
			<div class="form-group">
				<label for="exampleInputEmail1">Email address</label> 
				<input
					name="email"
					type="email" 
					class="form-control" 
					id="exampleInputEmail1"
					aria-describedby="emailHelp" 
					placeholder="Enter email">
			</div>
			<div class="form-group">
				<label for="password">Password</label>
				 <input
				 	name="password"
					type="password"
					class="form-control" 
					id="password"
					placeholder="Enter Password">
			</div>
			<div class="form-group">
				<label for="username">User Name</label> 
				<input
					name="name"
					type="text" 
					class="form-control" 
					id="username"
					placeholder="Enter User Name">
			</div>
			
			<div class="container text-center">
				<button type="submit" class="btn btn-success">Submit</button>
			</div>
			
		</form>
	</div>


	<script src="https://code.jquery.com/jquery-3.2.1.slim.min.js"
		integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN"
		crossorigin="anonymous"></script>
	<script
		src="https://cdn.jsdelivr.net/npm/popper.js@1.12.9/dist/umd/popper.min.js"
		integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q"
		crossorigin="anonymous"></script>
	<script
		src="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/js/bootstrap.min.js"
		integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl"
		crossorigin="anonymous"></script>
</body>
</html>