  
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Sprimg Mvc demo 2- ModelAndView, Prefix and Suffix ,Model,ModelMap,modelAttribute</title>
</head>
<body>
//to show- use of Prefix and Suffix ,Model,ModelMap <br>
	Result is : ${sum}
	<br/>
	<p>Date and time: ${time}</p>
	 <br/> 
//to show- use of @modelAttribute at method argument level <br>
	Show Person Object : ${person}
	<br><br>
	
//to show - use model attribute at method label. called for all action call<br>
	   welcome back ${name}

</body>
</html>