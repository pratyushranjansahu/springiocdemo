package com.workshop.springiocdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.core.env.Environment;

@SpringBootApplication
public class SpringiocdemoApplication implements CommandLineRunner{
	@Autowired
	private Environment environment;
	@Bean
	ValueBean myBean() {
		return new ValueBean();
	}
	

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(SpringiocdemoApplication.class, args);
		ValueBean myBean = context.getBean(ValueBean.class);
		myBean.startApplication();
	
	}
	


	private static class ValueBean {

		@Value("${app.title}")
		private String appTitle;

		public void startApplication() {
			System.out.printf("-- running application: %s --%n", appTitle);

		}
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println("Printing Value using Environmental Value : "+environment.getProperty("app.title"));
		
	}
}
