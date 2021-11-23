package com.example.HelloWorld.controllers;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.*;
 
@RestController
public class HelloWorldController {
 
    @RequestMapping("/hello")
    public String sayHello() {
        return "Hello World!! from spring boot!!";
    }
	//web service that takes the path variable:
	@GetMapping("/hello1/{name}")
	public String hello1(@PathVariable("name") String name)
	{
		return "Hello " + name;
	}
	//web service that passes parameters through URL:
	@GetMapping("/hello2")  
	
	public String hello2(@RequestParam(name="name", required = false, defaultValue = "CSE") String name)
	{
		return "Hello " + name;
	}
	@RequestMapping("/hello3")   
	//@ResponseBody
		public String hello3(@RequestParam(name = "id") String myId, @RequestParam String name) { 
    return "ID: " + myId + " Name: " + name;
	}
	
}

// Check outputs
// http://localhost:8082/hello
// http://localhost:8082/hello1/msrit
// http://localhost:8082/hello2
// http://localhost:8082/hello2?name=ELO
// http://localhost:8082/hello3?id=1&name=msrit