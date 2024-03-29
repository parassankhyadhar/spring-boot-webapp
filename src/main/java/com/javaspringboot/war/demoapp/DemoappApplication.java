package com.javaspringboot.war.demoapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class DemoappApplication {

	@GetMapping("/home")
	public String displayHome(){
		return "Hello, this is home" ;
	}

	@GetMapping("/about")
	public String displayAbout(){
		return "I am a simple spring boot application." ;
	}

	@GetMapping("/test")
	public String displayTest(){
		return "!!!Test Result!!!" ;
	}
	public static void main(String[] args) {
		SpringApplication.run(DemoappApplication.class, args);
	}

}
