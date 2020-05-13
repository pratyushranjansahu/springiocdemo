package com.workshop.springiocdemo.config;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScan.Filter;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Repository;

import com.workshop.springiocdemo.service.SteroService;
import com.workshop.springiocdemo.util.MyAnnotation;

@ComponentScan(basePackages = "com.workshop.springiocdemo",includeFilters = @Filter(MyAnnotation.class),
excludeFilters = @Filter(Repository.class))
@Configuration
public class ComponentScanConfig {

	public static void main(String[] args) {
		   ApplicationContext ctx = new AnnotationConfigApplicationContext(ComponentScanConfig.class);

		   SteroService steroService = (SteroService) ctx.getBean(SteroService.class);
	        //logger.info("The time is {}", timeService.getTime());
		   System.out.println("Using Component Scan");
		   
	       

	}

}
