<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
 	Welcome to spring boot mvc demo :Calculator
 	
 	<! action add is requestmapping to controller class , decides which method should be called .
 	    http://localhost:8080/add?num1=4&num2=7 will be called>
 	    
 	<form action="add">
 		Enter First No : <input type="text" name="num1"><br>
 		Enter Second No : <input type="text" name="num2"><br>
 		<input type="submit">
 	</form>
</body>
</html>