package com.example.resttest;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeController {

    @RequestMapping(value = "/welcome", method = RequestMethod.GET, produces = "text/plain")
	public String getPt() {
		return "Welcome...";
	}

}