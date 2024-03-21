package net.kdigital.jquery2.ajexTest.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import lombok.RequiredArgsConstructor;
import net.kdigital.jquery2.ajexTest.dto.CustomerDTO;
import net.kdigital.jquery2.ajexTest.service.CustomerService;

@Controller
@RequiredArgsConstructor
public class CustomerController {
	public final CustomerService service;
	
	@PostMapping("/insert")
	@ResponseBody  // 포워딩이나 리다이렉트가 아닌 데이터만 넘겨준다는 것을 알려줌 
	public CustomerDTO insert(@ModelAttribute CustomerDTO customerDTO) {
		CustomerDTO dto = service.insert(customerDTO);
		System.out.println("==========="+dto);
		return dto;
	}
	
	@GetMapping("/selectAll")
	@ResponseBody
	public List<CustomerDTO> selectAll() {
		List<CustomerDTO> list = service.selectAll();
		return list; 
	}
	
	@GetMapping("/delete")
	@ResponseBody
	public boolean delete(@RequestParam(name="customerNum") Long customerNum) {
		
		
		return service.delete(customerNum); // 잘지워졌으면 true 반환 
	}

}
