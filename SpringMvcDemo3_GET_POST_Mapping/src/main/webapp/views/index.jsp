<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Sprimg Mvc demo 2- ModelAndView, Prefix and Suffix ,Model,ModelMap</title>
</head>
<body>

//to show @PostMapping, as we are sending data to server it should not be a Get as it shows values in url
<br> 	
 	<form action="addPerson" method="post"> 
 		Enter Person Id : <input type="text" name="pid"><br>
 		Enter Person Name   : <input type="text" name="pname"><br>
 		<input type="submit">
 	</form>
 
 <br><br>
 // for method get , for now we dont need any form , we will hit in the
 // browser itself ie localhost:8080/getPerson	
 	
</body>
</html>