package com.poolsawat.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}
	
	@GetMapping(value ="/index")
	public String index() {
		return "index";
	}
	@GetMapping(value ="/home")
	public String home() {
		return "home";
	}
	@GetMapping(value ="/product")
	public String product() {
		return "product";
	}

}
