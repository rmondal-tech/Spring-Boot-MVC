package com.java.springboot.mvc;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MyController {

// 01 - Jsp Parsing problem- (Thymeleaf works )
 //----------------------------------------------
	//jsp is downloaded, not rendered on browser outside eclipse on hitting http://localhost:8080/	
	@RequestMapping("/") //for mapping web requests onto methods in request-handling classes with flexible method signatures. 
	String acceptRequest(){
		return "index.jsp";

	}

	
//02 - Jsp Parsing problem solution -tomcat-jasper
//	----------------------------------------------
	
//1. Jasper parses JSP files to compile them into Java code as servlets (that can be handled by Catalina).
//2. At runtime, Jasper is able to automatically detect JSP file changes and recompile them.	

 /* @RequestMapping("/") //for mapping web requests onto methods in request-handling classes with flexible method signatures.Support Get,Post both
  String acceptRequest1(){
	  return "index.jsp"; //now http://localhost:8080/ works
  }
  
* /
//03 - read request parameter passed from jsp using HttpServletRequest object
//---------------------------------------------------------------------------
  
//localhost:8080/add?num1=4&num2=7 will be called automatically when we click sum/submit button in index.jsp	
	/**
	 * @param req
	 * @return
	 */
//	@RequestMapping("add")
//	public String add(HttpServletRequest req)
//	{
//		int num1=Integer.parseInt(req.getParameter("num1"));// req parameter from form of index.jsp	
//	    int num2=Integer.parseInt(req.getParameter("num2"));	
//	
//        int sum=num1+num2;
//        HttpSession session= req.getSession();
//        session.setAttribute("sum", sum);//sum can be retrived in jsp using jstl ${sum}
//		return  "result.jsp";
//		
//	}


//04 - user @RequestParam to read parameters and use HttpSession in method arg
//----------------------------------------------------------------------------
 
//05 ModelAndView-

  @RequestMapping("add")
	public ModelAndView add(@RequestParam("num1")int i ,@RequestParam("num2") int j) {
  

//ModelAndView- Holder for both Model and View in the web MVC framework.
//This class merely holds both to make it possible for a controller to return both modeland view in a single return value. 

	  ModelAndView mv = new ModelAndView();
		mv.setViewName("result.jsp");
		int sum = i + j;
		
		mv.addObject("sum",sum); //add object to show in view 
		
		return  mv;
  
  }
  
}
 
/*


 
 */
