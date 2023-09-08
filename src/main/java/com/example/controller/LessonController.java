package com.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/lesson")


public class LessonController {
	
	 @GetMapping("/sample")
	    @ResponseBody
	    public String sample() {
	        return "Hello World!";
	    }
	 
	 @GetMapping("/")
	    @ResponseBody
	    public String index() {
	        return "Hello World!";
	    }

	    // http://localhost:8080/lesson/test にリクエストするとtest()が実行される
	    @GetMapping("/test")
	    @ResponseBody
	    public String test() {
	        return "Good Evening!";
	    }
	 

}
