<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Upload File</title>
</head>
<body>
<h1>Upload File</h1>
<form method="post" action="/student/insertWorkbookData" enctype="multipart/form-data">
	
	    Select Student Profile : <input type="file" name="file"/>
	    
	    <input type="submit" value="Upload" />
</form>
</body>
</html>