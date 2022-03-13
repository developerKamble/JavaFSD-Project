<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Book Flight</title>
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
<link
	href="https://stackpath.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css"
	rel="stylesheet" />
<link rel="stylesheet"
	href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
</head>
<body>
	<div class="container">
		<nav class="navbar navbar-inverse">
			<div class="container-fluid">
				<div class="navbar-header">
					<i style="font-size: 35px; color: lightgray" class="fa fa-plane"></i>
					<!-- <a class="navbar-brand" href="#">Developer Funnel</a> -->
				</div>
				<div class="collapse navbar-collapse"
					style="color: lightgray; margin-left: 60%">
					<ul class="nav navbar-nav">
						<li><a href="adminlogin.jsp">Admin Login</a></li>
						<li><a href="customerlogin.jsp">Customer Login</a></li>
						<li><a href="info.jsp">devloper details</a></li>
					</ul>
				</div>

			</div>
		</nav>
		<form action="book" method="post">
			<label for="src">Enter Source:</label> 
				<input type="text" name="src" id="src"> <br> <br> 
			<label for="dest">Enter Destination:</label> 
				<input type="text" name="dest" id="dest"> <br> <br> 
		   <label for="date">Enter Date:</label>
		   		<input type="date" name="date" id="date"> <br> <br> 
		   	<input type="submit" value="Search" />
		</form>
	</div>
</body>
</html>