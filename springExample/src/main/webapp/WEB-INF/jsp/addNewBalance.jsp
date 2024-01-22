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
    border-radius: 5px 5px 0 0;
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
  
}
</style>
<meta charset="ISO-8859-1">
<title>Mart</title>
</head>

<nav>
	<div class="topnav">
		<a class="active" href="home">Home</a> <a id="account" href="getLogin">Logout</a>
		<a id="account">${user.getUserFname()} ${user.getUserLname()}</a> <a
			id="account">Wallet: ${user.getUserBalance()}</a> <a
			href="getProducts">Products</a>
	</div>
</nav>
<body>
<h1>Add Balance</h1>

<form method="post" action="/mart/addBalance">
	<table border="1"width="100%" cellpadding="2" class="table">
	    <tr><th>Account Balance:</th> <td><input value="${user.getUserBalance()}" name="userBalance"/></td></tr>
	    <tr><th>Enter Balance to Add :</th> <td><input type="text" name="userBalance" /></td></tr>
	    <tr><td colspan="2" align="center"><input type="submit" value="Insert" align="center"/></td></tr>
    </table>
</form>
</body>
</html>