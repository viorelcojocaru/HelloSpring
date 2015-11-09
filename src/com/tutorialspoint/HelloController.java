package com.tutorialspoint;

import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

public class HelloController {

	@RequestMapping(method=RequestMethod.GET)
	public String printHello(ModelMap model){
		model.addAttribute("message", "Hello Spring MVC framework");
		return "hello";
	}
}

