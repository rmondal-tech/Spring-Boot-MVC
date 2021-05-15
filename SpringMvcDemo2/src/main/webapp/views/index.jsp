<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Sprimg Mvc demo 2- ModelAndView, Prefix and Suffix ,Model,ModelMap</title>
</head>
<body>
 //to show- use of Prefix and Suffix ,Model,ModelMap - Calculator <br>
 	<! action add is requestmapping to controller class , decides which method should be called .
 	    http://localhost:8080/add?num1=4&num2=7 will be called>
 	<form action="add">
 		Enter First No  : <input type="text" name="num1"><br>
 		Enter Second No : <input type="text" name="num2"><br>
 		<input type="submit">
 	</form>
 	
 	<br>

//to show- use of @modelAttribute at method argument level <br> 	
 	<form action="addPerson"> 
 		Enter Person Id : <input type="text" name="pid"><br>
 		Enter Person Name   : <input type="text" name="pname"><br>
 		<input type="submit">
 	</form>
 	
 	
</body>
</html>