<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
table {
	font-size: 20px;
}
</style>
</head>
<body>
	<div style="border: 2px solid black; background-color: yellow; height: 500px; width: 800px; margin-left: 300px; margin-top: 50px;">
		<br> <br>
		<div>
			<h1 style="display: flex; justify-content: center;">DISPLAY
				USERS</h1>
		</div>
		<div style="height: 300px; width: 450px; margin-left: 100px;">
			<table border="2px" style="border-collapse: collapse">
				<tr>
					<th>Id</th>
					<th>Name</th>
					<th>Phone</th>
					<th>Email</th>
					<th>Password</th>
					<th>Edit</th>
					<th>Delete</th>
				</tr>
				<c:forEach var="user" items="${display}">
					<tr>
						<td>${user.getId()}</td>
						<td>${user.getName()}</td>
						<td>${user.getPhone()}</td>
						<td>${user.getEmail()}</td>
						<td>${user.getPassword()}</td>
						<td><a href="editUser1?id=${user.getId()}">edit</a></td>
						<td><a href="deleteUser1?id=${user.getId()}">delete</a></td>
					</tr>
				</c:forEach>
			</table>
		</div>
	</div>
</body>
</html>