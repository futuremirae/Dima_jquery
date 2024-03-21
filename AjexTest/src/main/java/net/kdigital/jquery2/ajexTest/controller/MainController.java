package net.kdigital.jquery2.ajexTest.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {
	
	@GetMapping({"","/"})
	public String index() {
		return "index"; 
	}
	@GetMapping("/customer")
	public String customer() {
		return "customer"; 
	}

}
