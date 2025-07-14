package com.example.demo;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;


@RestController
public class CustomerController {
	
	@PostMapping
	String addCustomer(@RequestBody  Customer c)
	
	{
		if (c.getAge() < 18	) {
			
			return "Customer is not eligiblele"	;
	}
	
	return "Customer added"	;
	
	}
	
	@GetMapping("viewCustomer")
	Customer viewCustomer()
	
	{
		
		Customer dc = new Customer();
		dc.setName("John");
		dc.setAddress("pune");
		dc.setEmail("gmail.com");
		dc.setAge(26);
		
		return dc;
	}

}


