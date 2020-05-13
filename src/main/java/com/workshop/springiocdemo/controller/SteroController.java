package com.workshop.springiocdemo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.workshop.springiocdemo.service.SteroService;

@RestController
public class SteroController {
	@Autowired
	private SteroService steroService;
	
	public SteroController(){
		System.out.println("Acts As a controller");
	}

}
