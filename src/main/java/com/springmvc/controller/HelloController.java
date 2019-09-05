package com.springmvc.controller;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


@Controller
public class HelloController {

	/**
	 * Simply selects the home view to render by returning its name.
	 */
	
	//@GetMapping(value = "/")
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Locale locale, Model model) {
		System.out.println("Home Page Requested, locale = " + locale);
		Date date = new Date();
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);

		String formattedDate = dateFormat.format(date);

		model.addAttribute("serverTime", formattedDate);

		return "hello/hello";
	}

	//@GetMapping(value = "/hello/dude")
	@RequestMapping(value = "/hello/dude", method = RequestMethod.GET)
	public String what(Model model) {
		System.out.println("User Page Requested");
		//exit;
		model.addAttribute("text", "hey dude");
		return "hello/dude";
		
	}
	
	@GetMapping("hello/greeting1")
	//@RequestMapping(value = "hello/greeting1", method = RequestMethod.GET)
    public String greeting1(Model model) {
        model.addAttribute("name","Howdy");
        
       
        return "hello/greeting";
    }
	
	@GetMapping("hello/greeting2")
	//@RequestMapping(value = "hello//greeting", method = RequestMethod.GET)
    public String greeting(Model model) {
        model.addAttribute("name","Good Morning");
        return "hello/greeting";
    }
}
