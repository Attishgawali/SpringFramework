<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!doctype html>
<html lang="en">
<head>
<!-- Required meta tags -->
<meta charset="utf-8">
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no">

<!-- Bootstrap CSS -->
<link rel="stylesheet"
	href="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/css/bootstrap.min.css"
	integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm"
	crossorigin="anonymous">

<title>Hello, world!</title>
</head>
<body class="" style="background: #e2e2e2;">

	<div class="container mt-4">
		<div class="row">
			<div class="col-md-8 offset-md-2">
				<div class="card">
					<div class="card-body">
						<h3 class="text-center">Complex Form</h3>
						
						<div class="alert alert-danger" role="alert">
  							<form:errors path="student.*"/>
						</div>

						<form action="handleform">

							<div class="form-group">
								<label for="username">User Name</label> <input name="username" type="text"
									class="form-control" id="username" placeholder="Enter Name">
							</div>

							<div class="form-group">
								<label for="userid">User id</label> <input name="userid"  type="text"
									class="form-control" id="userid" placeholder="Enter Id">
							</div>

							<div class="form-group">
								<label for="date">User DOB</label> <input name="date" type="text"
									class="form-control" id="userdob" placeholder="dd/mm/yyyy">
							</div>

							<div class="form-group">
								<label for="Courses">Select Courses</label> <select
									name="courses" class="form-control" id="Courses" multiple>
									<option>Java</option>
									<option>C++</option>
									<option>Python</option>
									<option>JavaScipt</option>
									<option>SQL</option>
								</select>
							</div>

							<div class="form-group">
								<span class="mr-3">Select Gender</span>
								<div class="form-check form-check-inline">
									<input class="form-check-input" type="radio"
										name="gender" id="inlineRadio1" value="Male">
									<label class="form-check-label" for="inlineRadio1">Male</label>
								</div>
								<div class="form-check form-check-inline">
									<input class="form-check-input" type="radio"
										name="gender" id="inlineRadio2" value="Female">
									<label class="form-check-label" for="inlineRadio2">Female</label>
								</div>
							</div>
							
							

							<div class="form-group">
								<label for="student">Select Type</label> <select name="type"
									class="form-control" id="student">
									<option>Old Student</option>
									<option>Normal Student</option>
							</div>
							
							<div class="card mt-5">
								<div class="card-body">
									<p>Your Address</p>
									
									<div class="form-group">
										<input name="address.street" type="text" class="form-control" placeholder="Enter street">
									</div>
									
									<div class="form-group">
										<input name="address.city" type="text" class="form-control" placeholder="Enter city">
									</div>
								</div>
							</div>
							
							<button type="submit" class="btn btn-primary">Submit</button>
						</form>
					</div>
				</div>
			</div>
		</div>
	</div>



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