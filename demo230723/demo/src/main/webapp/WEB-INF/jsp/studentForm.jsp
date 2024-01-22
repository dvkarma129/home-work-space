<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
    <title>Registration Page</title>
</head>

<body>
<h1>Student Registration Page</h1>
<form method="post" action="/student/add" enctype="multipart/form-data">
	<table border="1" cellpadding="2" align="center">
	    <tr><th>Enter Student First Name :</th> <td><input type="text" name="studentFname"/></td></tr>
	    <tr><th>Enter Student Last Name :</th> <td><input type="text" name="studentLname"/></td></tr>
	    <tr><th>Enter Student Age :</th> <td><input type="text" name="studentAge"/></td></tr>
	    <tr><th>Select Student Gender:</th><td><select  name="studentGender">
		  <option value="male">Male</option>
		  <option value="female">Female</option>
		  <option value="others">Others</option>
		</select></td></tr>  
	    <tr><th>Enter Student Address :</th> <td><textarea name="studentAddress"></textarea></td></tr>
	    <tr><th>Enter Student Email Id :</th> <td><input type="text" name="studentEmailId"/></textarea></td></tr>
	    <tr><th>Select Student Profile :</th> <td><input type="file" name="profilePic"/></td></tr>
	    <tr><th>Enter Student Username :</th> <td><input type="text" name="studentUsername"/></td></tr>
	    <tr><th>Enter Student Password :</th> <td><input type="password" name="studentPassword"/></td></tr>
	    <tr><td colspan="2" align="center"><input type="submit" value="Submit" align="center"/></td></tr>
    </table>
   <a href="fileUpload"> Insert Bulk Record </a>
</form>
</body>
</html>