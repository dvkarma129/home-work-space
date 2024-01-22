    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
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
  background-color: #009879;
  color: white;
  }
  
  * {
    /* Change your font family */
    font-family: sans-serif;
}

.table {
    border-collapse: collapse;
    margin: 25px 0;
    font-size: 0.9em;
    min-width: 400px;
    border-radius: 0px 0px 0 0;
    overflow: hidden;
    box-shadow: 0 0 20px rgba(0, 0, 0, 0.15);
}

.table thead tr {
    background-color: #009879;
    color: #ffffff;
    text-align: left;
    font-weight: bold;
}

.table th,
.table td {
    padding: 12px 15px;
}

.table tbody tr {
    border-bottom: 1px solid #dddddd;
}

.table tbody tr:nth-of-type(even) {
    background-color: #f3f3f3;
}

.table tbody tr:last-of-type {
    border-bottom: 2px solid #009879;
}

.table tbody tr.active-row {
    font-weight: bold;
    color: #009879;
}

#button{
  background-color: #009879;
  border: none;
  color: white;
  padding: 12px 20px;
  text-align: center;
  text-decoration: none;
  display: inline-block;
  font-size: 15px;
}
  
}
</style>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Manage products</title>

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
<h1>Add new product</h1>

<form method="post" action="/mart/addProduct">
	<table border="1"width="100%" cellpadding="2" class="table">
	    <tr><th>Enter product Name :</th> <td><input type="text" name="itemName"/></td></tr>
	    <tr><th>Enter product price :</th> <td><input type="text" name="itemPrice" /></td></tr>
	    <tr><td colspan="2" align="center"><input id="button" type="submit" value="Insert" align="center"/></td></tr>
    </table>
</form>
</body>
</html>