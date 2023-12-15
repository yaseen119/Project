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
			<h1 style="display: flex; justify-content: center;">RECEIVE AMOUNT</h1>
		</div>
		<div style="height: 300px; width: 450px; margin-left: 150px;">
			<form:form action="receiveTo2" modelAttribute="account1">
				<table cellspacing="0px">
					<tr>
						<td>To Id:</td>
						<td><form:input path="id" /></td>
					</tr>
					<tr>
						<td colspan="2" align="center"><form:button>Ok</form:button></td>
					</tr>
				</table>
			</form:form>
		</div>
	</div>
</body>
</html>