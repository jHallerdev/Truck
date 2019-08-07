package com.explorador.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
	public class DemoController {
	
	@RequestMapping("/banana")
    public String testeBrowser() {
		return "text";
	}
    

}
