<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body >
<table>
	<tr><th>	</th><th><h1>Welcome User <%= request.getSession().getAttribute("uname") %></h1></th><tr>
		<tr>
			<td><h2>Options</h2></td>	
		</tr>
		<tr>
			<td><a href="list">Click here to view Flight details</a></td>
		</tr>
		<tr>
			<td><a href="addflights.jsp">Click here to add Flight details</a></td>
		</tr>
		<tr>
			<td><a href="alist">Click here to view Admin details</a></td>
		</tr>
		<tr>
			<td><a href="clist">Click here to view Customer details</a></td>
		</tr>
		<tr>
			<td><a href="olist">Click here to view Order details</a></td>
		</tr>
		<tr>
			<td><a href="changepassword.jsp"><font color="red">Click here to change password</font></a></td>
		</tr>
		<tr>
			<td><a href="logout"><font color="red">Click here to logout</font></a></td>
		</tr>
</table>
</body>
</html>