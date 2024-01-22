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
    <title>Update project</title>
</head>
<nav>
	<div class="topnav">
		<a class="active" href="adminPage">Home</a> 
		<a href="manageItems">Manage products</a>
		<a href="manageCat">Manage Category</a>  
		<a href="manageUsers">Manage Users</a>  
		<a id ="account" class="active" href="getAdminLogin">Logout</a> 
		<a id ="account" class="active">Total Revenue: ${admin.getMartRevenue()}</a> 
	</div>
</nav>
<body>
<h1>Update</h1>
<form method="post" action="/mart/update">
	<table border="1" cellpadding="2" align="center">
		<tr><th>Product Id :</th> <td><input type="text" name="itemId" value="${i.getItemId()}"/></td></tr>
	    <tr><th>Update product Name :</th> <td><input type="text" name="itemName" value="${i.getItemName()}"/></td></tr>
	    <tr><th>Update product price :</th> <td><input type="text" name="itemPrice" value="${i.getItemPrice()}"/></td></tr>
	    <tr><td colspan="2" align="center"><input type="submit" value="Update" align="center"/></td></tr>
    </table>
</form>
</body>
</html>