package net.kdigital.jquery2.ajexTest.controller;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import net.kdigital.jquery2.ajexTest.dto.CustomerDTO;

@Controller
public class AjaxController {
	
	@GetMapping("ajaxForm1")
	public String ajaxForm1() {
		return"ajaxForm1";
	}
	@GetMapping("mirae")
	public String mirae() {
		return"mirae";
	}
	
	@GetMapping("ajaxReq1")
	@ResponseBody
	public String ajaxReq1() { // 여기서 말하는 string 은 데이터이다 
		System.out.println("도착!");
		return"안녕!!!";
	}
	
	@PostMapping("ajaxReq2")
	@ResponseBody
	public String ajaxReq2(
			@RequestParam(name="username") String username,
			@RequestParam(name="email") String email) {
		System.out.println(username+","+email);
		return "success";
		
	}
	
	@PostMapping("ajaxReq3")
	@ResponseBody
	public Map<String,String> ajaxReq3(@RequestParam Map<String,String> map) {
		System.out.println(map);
		return map;
		
	}
	
	@GetMapping("/ajaxReq4")
	@ResponseBody
	public List<CustomerDTO> ajaxReq4() {
		List<CustomerDTO> list = Arrays.asList(
				new CustomerDTO(1L,"홍길동","kml@naver.com"),
				new CustomerDTO(2L,"최민식","kml@naver.com"),
				new CustomerDTO(3L,"저팔","kml@naver.com"),
				new CustomerDTO(4L,"김우식","kml@naver.com")
				);
				
		return list;
	
		
	}
	
	

}
