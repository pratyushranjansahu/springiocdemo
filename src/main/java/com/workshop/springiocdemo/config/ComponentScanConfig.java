package com.workshop.springiocdemo.config;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.workshop.springiocdemo.service.SteroService;

@ComponentScan(basePackages = "com.workshop.springiocdemo")
@Configuration
public class ComponentScanConfig {

	public static void main(String[] args) {
		   ApplicationContext ctx = new AnnotationConfigApplicationContext(ComponentScanConfig.class);

		   SteroService steroService = (SteroService) ctx.getBean(SteroService.class);
	        //logger.info("The time is {}", timeService.getTime());
		   System.out.println("Using Component Scan");
		   
	       

	}

}
