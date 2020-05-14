package com.workshop.springiocdemo;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.core.env.ConfigurableEnvironment;
import org.springframework.core.env.StandardEnvironment;

import com.workshop.springiocdemo.config.ProfileAppConfig;

public class ClientProfile {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
		// Enable a "prod" profile
		// context.getEnvironment().setActiveProfiles("prod");
		ConfigurableEnvironment environment = new StandardEnvironment();
		environment.setActiveProfiles("dev");

		context.register(ProfileAppConfig.class);
		context.refresh();

		((ConfigurableApplicationContext) context).close();

	}

}
