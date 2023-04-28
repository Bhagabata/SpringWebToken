package com.example.demoSpringBoot;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class home {
	@RequestMapping("home")
	
public String home() {
	System.out.println("hi hello from spring boot ");
	return "home.jsp";
}
}
