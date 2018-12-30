<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Spring boot JPA|H2|WEB</title>
</head>
<body>
	<h1>Add students</h1>
	<form action="addStudent">
		ID <input type="text" name="id"><br>
		Name <input type="text" name="name"> <input type="submit">
	</form>	
	
	<br><br>
	
	<h1>Search with id</h1>
	<form action="searchStudent">
		ID <input type="text" name="id"> <input type="submit">
	</form>
		
	<form action="getAllStudent" name="getAllStudent">
		<a href="getAllStudent">Get all student names</a>
    </form>
	
	
</body>
</html>