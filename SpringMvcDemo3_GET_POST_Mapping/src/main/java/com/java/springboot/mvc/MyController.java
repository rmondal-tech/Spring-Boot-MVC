package com.java.springboot.mvc;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.java.springboot.mvc.model.Person;

@Controller
public class MyController {
	static List<Person> personsList=new ArrayList<>();

//@RequestMapping support all HTTP operation , but we want to restrict only to post or get or ..
	
	// @RequestMapping("addPerson")
	//optoin 1- @RequestMapping(value="addPerson",method = RequestMethod.POST)
	//option2 @XXXMapping
	
	@PostMapping("addPerson")
	 public String addPerson(Person p , Model m) //by default use @ModelAttribute for Person
		{
		personsList.add(p);
			m.addAttribute("person",personsList);
			return "result";
//we are  storing into any temporary list
		}
	
	
	@GetMapping("getPerson")
	 public String showPerson(Person p , Model m) //by default use @ModelAttribute for Person
		{
// need to show one dummy user in view 
		personsList.add(p);// person from form//null
		Person p1=new Person();p1.setPid(10);p1.setPname("Rakesh");
		personsList.add(p1);//new user added here 
		
			m.addAttribute("person",personsList);//same needs to be retrieved in jsp
			return "result";
//we are not storing into any temporary or permanent storage
		}	
	
}