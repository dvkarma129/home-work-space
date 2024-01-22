
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<script src="https://ajax.aspnetcdn.com/ajax/jQuery/jquery-3.3.1.min.js">
</script>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>View Student</title>

</head>
<Style>
img {
	height: 40px;
	width: 40px;
	border-radius: 50px;
	margin-left: 22px;
}
</Style>
<body>
	<table border="1" width="100%" cellpadding="2">
		<thead>
			<tr>
				<th>Student Id</th>
				<!-- <th>Student Pic</th> -->
				<th>Student First Name</th>
				<th>Student Last Name</th>
				<th>Student Age</th>
				<th>Student Gender</th>
				<th>Student Address</th>
				<th>Student Username</th>
				<th>Student Password</th>
				<th>Update</th>
				<th>Delete</th>
			</tr>
		</thead>
		<c:forEach var="student" items="${student.stdDto}">
			<tr>
				<td>${student.getStudentId()}</td>
				<!-- <td><img src=${student.getStudentProfilePic()}></td> -->
				<td>${student.getStudentFname()}</td>
				<td>${student.getStudentLname()}</td>
				<td>${student.getStudentAge()}</td>
				<td>${student.getStudentGender()}</td>
				<td>${student.getStudentAddress()}</td>
				<td>${student.getStudentUsername()}</td>
				<td>${student.getStudentPassword()}</td>
				<td><a href="updateStudent?studentId=${student.getStudentId()}">Update</a></td>
				<td><a href="deleteStudent?studentId=${student.getStudentId()}">Delete</a></td>
			</tr>
		</c:forEach>
		<br>
		<br>
		<table border="1" width="100%" cellpadding="2">
			<thead>
				<tr>
					<th>Teacher Id</th>
					<th>Teacher Name</th>
					<th>Teacher Age</th>
					<th>Update</th>
					<th>Delete</th>
				</tr>
			</thead>
			<c:forEach var="teacher" items="${student.teaDto}">
				<tr>
					<td>${teacher.getTeacherId()}</td>
					<td>${teacher.getTeacherName()}</td>
					<td>${teacher.getTeacherAge()}</td>
					<td><a
						href="updateStudent?studentId=${teacher.getTeacherId()}">Update</a></td>
					<td><a
						href="deleteStudent?studentId=${teacher.getTeacherId()}">Delete</a></td>
				</tr>
			</c:forEach>

			<a href="generateWorkbook"> Generate Workbook </a>

		</table>
</body>
</html>