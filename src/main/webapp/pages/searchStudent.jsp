<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Searched student</title>
</head>
<body>

	<table>
		<tbody>
			<tr>
				<th>id</th><th>name</th>
			</tr>
			<tr>
				<td>${searchStudent.id}</td>
				<td>${searchStudent.name}</td> 
			</tr>			
		</tbody>	
	</table>
	${searchStudent}
</body>
</html>