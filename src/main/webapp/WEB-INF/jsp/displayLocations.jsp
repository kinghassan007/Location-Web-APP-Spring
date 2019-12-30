<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@page isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>display Location</title>
<link href="webjars/bootstrap/3.3.6/css/bootstrap.min.css"
	rel="stylesheet">
</head>
<body style="margin:0 auto;
padding: 0 20px 20px 20px;
width:600px;
border:4px solid black;">

	<h2>Display Location</h2>


	<table class="table">
		<thead class="thead-dark">
			<tr>
				<th scope="col">id</th>
				<th scope="col">code</th>
				<th scope="col">name</th>
				<th scope="col">type</th>
				<th scope="col">Delete</th>
				<th scope="col">Edit</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach items="${Locations}" var="location">
				<tr>
					<td>${location.id}</td>
					<td>${location.code}</td>
					<td>${location.name}</td>
					<td>${location.type}</td>

					<td><a class="btn btn-danger"
						href="deleteLocation?id=${location.id}">Delete</td>

					<td><a class="btn btn-warning"
						href="showUpdate?id=${location.id}">Edit</a></td>
				</tr>

			</c:forEach>

		</tbody>
	</table>
	<a class="btn btn-primary" href="showCreate">Add Location</a>
	<a class="btn btn-primary" href="generateReport">Show Raport</a>
	
	
</body>
</html>