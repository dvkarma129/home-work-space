<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login Page</title>
</head>
<style>
Body {
	font-family: Calibri, Helvetica, sans-serif;
	background-color: white;
}

button {
	background-color: #009879;
	width: 100%;
	color: white;
	padding: 15px;
	margin: 10px 0px;
	cursor: pointer;
}

form {
	border: 3px solid #f1f1f1;
	width: 50%;
	margin-left: 25%;
}

input[type=text], input[type=password] {
	width: 100%;
	margin: 8px 0;
	padding: 12px 20px;
	display: inline-block;
	border: 2px solid black;
	box-sizing: border-box;
}

button:hover {
	opacity: 0.7;
}

.cancelbtn {
	width: auto;
	padding: 10px 18px;
	margin: 10px 5px;
}

.href1{
	float: right;
}

.href2{
	float: left;
}

.loginform {
	padding: 25px;
	background-color: lightblue;
	width: 88.4;
}

.h1 {
  padding: 25px;
}

</style>
</head>
<body>

	<br><br><br><br><br><br>
	<form method="post" action="/mart/login">
		<div class="loginform">
			<label>Username: </label> 
			<input type="text"placeholder="Enter Username" name="userUsername" required> 
			
			<label>Password: </label> 
			<input type="password" placeholder="Enter Password"name="userPassword" required>
			<button type="submit">Login</button>
			<a class="href1" href="getNewUser"> New User Register? </a>
			<br>
			<a class="href2" href="getAdminLogin"> Admin Login? </a>
			
		</div>
	</form>
</body>
</html>