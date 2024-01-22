<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<style>
* {
    /* Change your font family */
    font-family: sans-serif;
}
.topnav {
	background-color: #333;
	overflow: hidden;
}

.topnav a {
	float: left;
	color: #f2f2f2;
	text-align: center;
	padding: 14px 16px;
	text-decoration: none;
	font-size: 17px;
}

#account {
	float: right
}

.topnav a:hover {
	background-color: #ddd;
	color: black;
}

.topnav a.active {
	background-color: #009879;
	color: white;
}
</style>
<meta charset="ISO-8859-1">
<title>Mart</title>
</head>

<nav>
	<div class="topnav">
		<a class="active" href="home">Home</a> <a id="account" href="getLogin">Logout</a>
		<a id="account">${user.getUserFname()} ${user.getUserLname()}</a> 
		<a id="account" href="addNewBalance">Wallet: ${user.getUserBalance()}</a> 
		<a href="getProducts">Products</a>
	</div>
</nav>

<body>
<h1>Welcome to MART</h1>
</body>
</html>