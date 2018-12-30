<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>All student</title>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<style>
table,th,td
{
border:1px solid black;
}
</style>

</head>
<body>

	<table>
		<tbody>
			<tr>
				<th>id</th><th>name</th>
			</tr>
			
			<c:forEach items="${getAllStudent}" var="student">
				<tr>
					<td><c:out value="${student.id}"/></td>
					<td><c:out value="${student.name}"/></td>  
				</tr>
			</c:forEach>
			
		</tbody>	
	</table>
	
	
</body>
</html>