package com.ahmedalzhrani.springbootstarter.hello;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
	
	@RequestMapping("/hello")
	public String sayHi(){
		
		
		return "Hi";
	}
	
	@RequestMapping("/addition/{number1}/{number2}")
	public String addTwoNumber(@PathVariable("number1") int a, @PathVariable("number2") int b){
		
		int result = a + b;
		return String.valueOf(result); 
		
	}

}
