package com.workshop.springiocdemo;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.workshop.springiocdemo.config.ProfileAppConfig;

public class ClientProfile {

	public static void main(String[] args) {
		  AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
		  //Enable a "live" profile
		  context.getEnvironment().setActiveProfiles("prod");
		  
		  context.register(ProfileAppConfig.class);
		  context.refresh();

		  ((ConfigurableApplicationContext) context).close();

	}

}
