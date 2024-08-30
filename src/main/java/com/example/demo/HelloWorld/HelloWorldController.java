package com.example.demo.HelloWorld;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "api/HelloWorld")
public class HelloWorldController {
    @GetMapping
	public String HelloWorld(){
		return "Hello World";
	}
}
