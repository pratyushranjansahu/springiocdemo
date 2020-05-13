package com.workshop.springiocdemo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.workshop.springiocdemo.dao.SteroDao;

@Service
public class SteroService {
	@Autowired
	private SteroDao steroDao;
	
	public SteroService(){
		System.out.println("Acts as Service");
	}
	
}
