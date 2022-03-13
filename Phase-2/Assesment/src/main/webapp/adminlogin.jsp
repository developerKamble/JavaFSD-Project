<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>AdminLogin</title>
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
</head>
<body>

	<div class="container">
		<div class="row">
			<div class="col-lg-6">
			
				<h1>Log-In</h1>

				<div class="panel panel-primary ">

					<div class="panel-heading">Admin Sign-in 
					<div class="panel-body">
						<form action="alogin" method="post">
							<div class="form-group">
								<label for="username">UserName</label> <input type="text"
									class="form-control" placeholder="username" name="aname"
									id="username" required />
							</div>
							<div class="form-group">
								<label for="password]">password</label> <input type="password"
									class="form-control" placeholder="password" name="pass"
									id="password" />
							</div>

							<input type="submit" class="btn btn-info" />
						</form>
					</div>
				</div>
			</div>
		</div>
</body>
</html>