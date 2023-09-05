<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<%@ include file="./base.jsp"%>
<title>Insert title here</title>
</head>
<body>

	<div class="container m-3">

		<div class="row">

			<div class="col-md-6 offset-md-5">
				<h1 class="text-center mb-3">Fill The Product</h1>

				<form action="/handle-form">
					<div class="form-group">
						<label for="name">Product Name</label> <input name="name"
							type="text" class="form-control" id="name"
							placeholder="Enter Product Name">
					</div>

					<div class="form-group">
						<label for="description">Product Description</label>
						<textarea name="description" rows="5" class="form-control"
							id="description" placeholder="Enter Product description"></textarea>
					</div>

					<div class="form-group">
						<label for="price">Product Price</label>
						<input type="text" name="price" rows="5" class="form-control"
							id="price" placeholder="Enter Product Price" />
					</div>
					
					<div class="container text-center">
						<a href="${pageContext.request.contextPath}/" class="btn btn-outline-danger">Back</a>
						<button type="submit" class="btn btn-outline-success">Add</button>
					</div>

				</form>
			</div>

		</div>
	</div>
</body>
</html>