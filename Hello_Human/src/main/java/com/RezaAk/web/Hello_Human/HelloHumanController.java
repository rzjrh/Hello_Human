package com.RezaAk.web.Hello_Human;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class HelloHumanController {
	
	@RequestMapping("/")
	public String index(@RequestParam(value="name", required=false) String name) {
		if(name == null) {
			return "Hello Human, Welcom to Spring Boot!";
			
			
		}else {
			//the key example: http://localhost:8080/?name=Reza
			return "Hello "+ name+", Welcom to Spring Boot!";
		}
	}
}
