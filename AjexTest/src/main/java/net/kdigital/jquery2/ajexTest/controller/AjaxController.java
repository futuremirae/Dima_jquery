package net.kdigital.jquery2.ajexTest.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AjaxController {
	
	@GetMapping("ajaxForm1")
	public String ajaxForm1() {
		return"ajaxForm1";
	}

}