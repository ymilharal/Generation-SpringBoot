package com.helloworld.hello.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class hellocontroller {
	@GetMapping()
	public String hello() {
		return "\n\t\t\t\t\tOlá mundo, your planta is much beautiful\n";
	}
}