  
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Sprimg Mvc demo 2- ModelAndView, Prefix and Suffix ,Model,ModelMap,modelAttribute</title>
</head>
<body>
 
//{person} to show @PostMapping result and also same {person} holds the value of Get result <br>
	
	Show Person Object created in @PostMapping handler method:
	                    ${person}	

<br><br>
 // for method get , for now we dont need any form , we will hit in the
 // browser itself ie localhost:8080/getPerson	
</body>
</html>