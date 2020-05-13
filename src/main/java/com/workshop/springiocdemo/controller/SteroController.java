package com.workshop.springiocdemo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.workshop.springiocdemo.service.SteroService;

//@Controller
@RestController
@RequestMapping("/stero")
public class SteroController {
	@Autowired
	private SteroService steroService;
	
	public SteroController(){
		System.out.println("Acts As a  Rest Controller");
	}
	@GetMapping
	@ResponseBody
	public String getString(){
		return "From Rest Controller";
	}

}
