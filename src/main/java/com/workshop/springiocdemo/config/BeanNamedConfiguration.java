package com.workshop.springiocdemo.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Description;
import org.springframework.context.annotation.PropertySource;

import com.workshop.springiocdemo.beans.BeanNameHelloMessage;

@Configuration
@PropertySource(value = "message.properties")
public class BeanNamedConfiguration {
	@Value("${message}")
	private String message;
	
	@Bean(name={"myMessage", "motd"})
	@Description("Provides a basic example of a bean")
    public BeanNameHelloMessage helloMessageProducer() {

		BeanNameHelloMessage helloMessage = new BeanNameHelloMessage(message);

        return helloMessage;
    }
}
