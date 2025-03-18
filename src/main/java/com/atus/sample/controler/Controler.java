package com.atus.sample.controler;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controler {
	
	@GetMapping("/result")
	public String getResult() {
		return "Hellow";
	}
	@GetMapping("/test")
	public String test() {
	    return "Test successful!";
	}
}
