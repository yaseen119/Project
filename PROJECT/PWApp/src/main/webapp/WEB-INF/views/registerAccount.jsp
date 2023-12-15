<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
table {
	font-size: 30px;
}
</style>
</head>
<body>
	<div style="border: 2px solid black; background-color: yellow; height: 500px; width: 600px; margin-left: 400px; margin-top: 50px;">
		<br> <br>
		<div>
			<h1 style="display: flex; justify-content: center;">REGISTER ACCOUNT</h1>
		</div>
		<div style="height: 300px; width: 450px; margin-left: 150px;">
			<form:form action="saveAccount1" modelAttribute="account1">
				<table cellspacing="0px">
					<tr>
						<td>Id:</td>
						<td><form:input path="id" /></td>
					</tr>
					<tr>
						<td>Account no:</td>
						<td><form:input path="accNo" /></td>
					</tr>
					<tr>
						<td>Min Bal:</td>
						<td><form:input path="minBal" /></td>
					</tr>
					<tr>
						<td>Amount:</td>
						<td><form:input path="amount"/></td>
					</tr>
					<tr>
						<td colspan="2" align="center"><form:button>Register</form:button></td>
					</tr>
				</table>
			</form:form>
		</div>
	</div>
</body>
</html>