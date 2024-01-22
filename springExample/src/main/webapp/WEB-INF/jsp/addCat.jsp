<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
    <title>MAnage category</title>
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
<h1>Add CAtegory</h1>

<form method="post" action="/mart/addCat">
	<table border="1" cellpadding="2" align="center">
	    <tr><th>Enter Category Name :</th> <td><input type="text" name="catName"/></td></tr>
	    <tr><td colspan="2" align="center"><input type="submit" value="Insert" align="center"/></td></tr>
    </table>
</form>
</body>
</html>