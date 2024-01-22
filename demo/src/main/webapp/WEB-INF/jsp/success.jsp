<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Registration</title>
</head>
<style>
 h1 {
 	color:green;
 }
</style>
<body>
<h1>Welcome ${student.getStudentFname()} ${student.getStudentLname()}</h1>
<a href="view"> View Student Data </a> 
&emsp;
<a href="logout"> Logout </a> 
</body>
</html>