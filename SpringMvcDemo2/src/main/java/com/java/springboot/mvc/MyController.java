package com.java.springboot.mvc;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.java.springboot.mvc.model.Alien;
import com.java.springboot.mvc.model.Person;
/*
 * Model, ModelMap, ModelAndView--
Model, ModelMap, and ModelAndView are used to define a model in a Spring MVC application.
1.  Model defines a holder for model attributes and is primarily designed for adding attributes to the model.
2.  ModelMap is an extension of Model with the ability to store attributes in a map and chain method calls.
3.  ModelAndView is a holder for a model and a view; it allows to return both model and view in one return value
 */
@Controller
public class MyController {

//01 - Jsp Parsing problem- (Thymeleaf works )
 //----------------------------------------------
	@RequestMapping("/") //for mapping web requests onto methods in request-handling classes with flexible method signatures. 
	String acceptRequest(){
		return "index";

	}


//04 - user ModelAndView to return as response
//----------------------------------------------------------------------------
  
/*
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
  
  */
	
//05 Prefix and Suffix in application.properties for view 
//-------------------------------------------------------
/*	
	  @RequestMapping("add")
		public ModelAndView add(@RequestParam("num1")int i ,@RequestParam("num2") int j) {

	//ModelAndView- Holder for both Model and View in the web MVC framework.
	//This class merely holds both to make it possible for a controller to return both modeland view in a single return value. 

		  ModelAndView mv = new ModelAndView();
			mv.setViewName("result");// not giving result.jsp bcz Suffix is taking care
			int sum = i + j;
			
			mv.addObject("sum",sum); //add object to show in view 
			
			return  mv;
	  
	  }
*/
	
	

//06 Model - add attribute to model but return only view ,it will have model data automatically
//-------------------------------------------------------	  
/*	
	@RequestMapping("add")
		public String add(@RequestParam("num1")int i ,@RequestParam("num2") int j, Model m)
		{
			
		
			int num3 = i + j;
			
			m.addAttribute("sum",num3);
			
			return  "result";
			
		}
*/
	//06  ModelMap - add attribute to model but return only view ,Supports chained calls and generation of model attribute names. 
	//-------------------------------------------------------	  
		  @RequestMapping("add")
			public String add(@RequestParam("num1")int i ,@RequestParam("num2") int j, ModelMap m)
			{
				
			
				int num3 = i + j;
				 var ldt = LocalDateTime.now();

				    var fmt = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.MEDIUM);

				    fmt.withLocale(new Locale("en", "en"));
				    fmt.withZone(ZoneId.of("CET"));

				    var time = fmt.format(ldt);
				
			m.
			 addAttribute("sum",num3)
			.addAttribute("time",time); // add multiple attribute in map - chain calls
			
				
				return  "result";
				
			}

//07 - 	Default use of ModelAttribute to map form request to model object	  
/*
	  @RequestMapping("addPerson")
		public String addPerson(Person p , Model m) //by default use @ModelAttribute for Person
		{

			m.addAttribute("person",p);//same needs to be retrieved in jsp
			return "result";

		}
		
 */
//08	@ModelAttribute  
//@ModelAttribute- Annotation that binds a method parameter or method return value to a named model 
//attribute, exposed to a web view. 	
//basically it collects a form as a model object and add that object in model , so no need of m.addAttr..()		  
	
	  
		  @RequestMapping("addPerson")
			public String addPerson(@ModelAttribute Person p , Model m)
			{

		//		m.addAttribute("person",p);//redundanant as @ModelAttribute is taking care
				return "result";

			}
	 
//09 ModelAttribute
// better to keep this method on top . as will be called first for all action
// @ModelAttribute- at method level. to add value to jsp dynamically for any call of action . It must be executed for all action		  
		 @ModelAttribute
		 public void modelData(Model m) {
			  m.addAttribute("name", "Rahul");
		  }
}
 

