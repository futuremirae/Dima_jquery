package net.kdigital.jquery2.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class JQueryController {
	
	@GetMapping("/traversing")
	public String traversing() {
		return "traversing";
		
	}
	
	@GetMapping("/each")
	public String each() {
		return "each";
		
	}
	@GetMapping("/customer")
	public String customer() {
		return "customer";
		
	}
}
