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
<button align="center" onclick="window.location.href = 'addNewCat';">Add Cat</button>
<br>
<br>
<table border="1"width="100%" cellpadding="2">
<thead>
<tr>
<th>Category Id</th>
<th>Category Name</th>
<th>Update</th>
<th>Delete</th>
</tr>
</thead>
<c:forEach var="c" items="${c}">	
<tr>
<td>${c.getCatId()}</td>
<td>${c.getCatName()}</td>
<td><a href="updateCat?CatId=${c.getCatId()}">Update</a></td>
<td><a href="deleteCat?CatId=${c.getCatId()}">Delete</a></td>
</tr>
</c:forEach>

</table>
</body>
</html>