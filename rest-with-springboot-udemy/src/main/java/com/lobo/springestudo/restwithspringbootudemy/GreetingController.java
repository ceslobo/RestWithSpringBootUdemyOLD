package com.lobo.springestudo.restwithspringbootudemy;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController {
	
	private static final String template = "Olá, %s!";
	
	private final AtomicLong counter = new AtomicLong();
	
	@RequestMapping("greetings")
	public Greeting greeting(@RequestParam(value="name", defaultValue = "você") String name) {
		return new Greeting(counter.incrementAndGet(), String.format(template, name));
	}
	

}
