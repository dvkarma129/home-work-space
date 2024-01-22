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
  background-color: #04AA6D;
  color: white;
  
 #th{
  background-color: #04AA6D;
  color: white;
  }
}
</style>
<script src="https://ajax.aspnetcdn.com/ajax/jQuery/jquery-3.3.1.min.js">
</script>
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
<br>
<body>
 <table border="1"width="100%" cellpadding="2">
<thead>
<tr>
<th>User Id</th>
<th>User FirstName</th>
<th>User LastName</th>
<th>User Balance</th>
<th>User Contact</th>
<th>User Address</th>
<th>User Username</th>
<th>User Password</th>
<th>Delete</th>
</tr>
</thead>
<c:forEach var="u" items="${u}">	
<tr>
<td>${u.getUserId()}</td>
<td>${u.getUserFname()}</td>
<td>${u.getUserLname()}</td>
<td>${u.getUserBalance()}</td>
<td>${u.getUserContact()}</td>
<td>${u.getUserAddress()}</td>
<td>${u.getUserUsername()}</td>
<td>${u.getUserPassword()}</td>
<!-- <td><a href="updateUser?UserId=${u.getUserId()}">Update</a></td> -->
<td><a href="deleteUser?UserId=${u.getUserId()}">Delete</a></td>
</tr>
</c:forEach>

</table>
</body>
</html>