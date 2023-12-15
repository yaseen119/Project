<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
#div1 {
	border: 2px solid black;
	color: green;
	text-align: center;
}

#div2 {
	border: 2px solid black;
	display: flex;
	justify-content: space-around;
}

a {
	color: red;
}
</style>
</head>
<body>
	<div style="border: 2px solid black; background-color: aquamarine; height: 500px; width: 600px; margin-left: 400px; margin-top: 50px;">
		<div id="div1">
			<h3>WELCOME TO PAYMENT APPLICATION</h3>
		</div>
		<div id="div2">
			<span><a href="aboutUs">ABOUT</a></span> 
			<span><a href="servicesOffered">SERVICES</a></span>
			<span><a href="contactUs">CONTACT US</a></span> 
			<span><a href="loginUser">LOGIN</a></span>
			<span><a href="registerUser">REGISTER</a></span> 
			<span><a href="settingUser">SETTING</a></span>
		</div>
		<div style="border: 2px solid black; height: 300px; width: 450px; margin-left: 80px; margin-top: 50px;">
			<br> <br> <br> <br>
			<div style="display: flex;justify-content: space-around;margin-left: 20px;">
				<h1>THIS IS PAYMENT APPLICATION HOMEPAGE</h1>
			</div>
		</div>
	</div>
</body>
</html>