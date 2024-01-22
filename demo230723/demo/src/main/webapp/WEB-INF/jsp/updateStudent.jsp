<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
    <title>Registration Page</title>
</head>

<body>
<h1>Update</h1>
<form method="post" action="/student/update">
	<table border="1" cellpadding="2" align="center">
		<tr><th>Student Id :</th> <td><input type="text" name="studentId" value="${student.getStudentId()}"/></td></tr>
	    <tr><th>Update Student First Name :</th> <td><input type="text" name="studentFname" value="${student.getStudentFname()}"/></td></tr>
	    <tr><th>Update Student Last Name :</th> <td><input type="text" name="studentLname" value="${student.getStudentLname()}"/></td></tr>
	    <tr><th>Update Student Age :</th> <td><input type="text" name="studentAge" value="${student.getStudentAge()}"/></td></tr>
	    <tr><th>Update Student Gender :</th> <td><input type="text" name="studentGender" value="${student.getStudentGender()}"/></td></tr>
	    <tr><th>Update Student Address :</th> <td><textarea name="studentAddress">${student.getStudentAddress()}</textarea></td></tr>
	    <tr><th>Update Student Username :</th> <td><input type="text" name="studentUsername" value="${student.getStudentUsername()}"/></td></tr>
	    <tr><th>Update Student Password :</th> <td><input type="password" name="studentPassword" value="${student.getStudentPassword()}"/></td></tr>
	    <tr><td colspan="2" align="center"><input type="submit" value="Update" align="center"/></td></tr>
    </table>
</form>
</body>
</html>