package io.github.pappuraj.controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestMapping;

import database.MyConsoleApplication;
import database.RoboticProduct;
import database.RoboticShopDao;

@Controller
public class HomeController {
	
	@RequestMapping("/")
	public String home(Model model) {
		ApplicationContext context=new ClassPathXmlApplicationContext("database/config.xml");
		
		System.out.println("".charAt(0));
		
		RoboticShopDao dao=context.getBean("myd",RoboticShopDao.class);
		List<RoboticProduct> products;
		try {
			 products=dao.viewAllProduct();
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			products=new ArrayList<RoboticProduct>();
		} 
		model.addAttribute("data", products);
		
		return "index";
	}
	
	@RequestMapping("/about")
	public String about(Model model) {
		
		List<String> li=new ArrayList<String>();
		li.add("Raj");
		li.add("Keya");
		li.add("Shayeri");
		
		
		model.addAttribute("name", "Pappuraj Bhottacharjee");
		model.addAttribute("names", li);
		return "about";
	}	
	
	//for exception handling
//	@ExceptionHandler({NullPointerException.class,StringIndexOutOfBoundsException.class})
//	public String handle() {
//		System.out.println("NULL=================");
//		return "error";
//	}

}
