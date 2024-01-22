<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<style>
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
	background-color: #04AA6D;
	color: white;
}

.header {
	float: center;
}
</style>
<meta charset="ISO-8859-1">
<title>Mart Manage</title>
</head>

<nav>
	<div class="topnav">
		<a class="active" href="adminPage">Home</a>
		 <a href="manageItems">Manage products</a> 
		 <a href="manageCat">Manage Category</a> 
		 <a href="manageUsers">Manage Users</a> 
		 <a id="account" class="active" href="getAdminLogin">Logout</a> 
		 <a id="account" class="active">Total Revenue: ${admin.getMartRevenue()}</a>
	</div>
</nav>

<body>
	<h1>Wellcome Admin</h1>

</body>
</html>