<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
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

.header{
float: center;
}

</style>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
    <title>Buy product</title>
</head>
<nav>
	<div class="topnav">
		<a class="active" href="home">Home</a> 
		<a id ="account" href="getLogin">Logout</a> 
		<a id ="account" >${user.getUserFname()} ${user.getUserLname()}</a> 
		<a id ="account" >Wallet: ${user.getUserBalance()}</a> 
		<a href="getProducts">Products</a>
	</div>
</nav>
<body>
<h1>Purchased successfully</h1>
</body>
</html>