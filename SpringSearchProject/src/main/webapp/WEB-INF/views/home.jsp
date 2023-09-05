<!doctype html>
<html lang="en">
<head>
<!-- Required meta tags -->
 <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<meta charset="utf-8">
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no">

<!-- Bootstrap CSS -->
<link rel="stylesheet"
	href="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/css/bootstrap.min.css"
	integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm"
	crossorigin="anonymous">


<link href="<c:url value='/resources/css/style.css' /> " > </link>

<script src="<c:url value='/resources/js/script.js' /> " > </script>

<title>Hello, world!</title>
</head>
<body>
	<div class="container ">
		<div class="card mx-auto mt-5 bg-secondary" style="width: 50%">
			<div class="card-body">
				<form action="processForm">

					<div class="form-group text-center">
						<label for="query" style="color: white">Search Your Query</label> 
						<input
							name="query"
							type="text" 
							class="form-control" 
							id="query"
							placeholder="Enter key words">
					</div>
					

					
					<button type="submit" class="btn btn-success">Submit</button>
				</form>
				
				
			</div>
			
		</div>
		
	</div>
	<img alt="my image" src="/resources/images/shutterstock.jsp" />

	<!-- Optional JavaScript -->
	<!-- jQuery first, then Popper.js, then Bootstrap JS -->
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