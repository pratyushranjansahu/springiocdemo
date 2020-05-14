package com.workshop.springiocdemo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.workshop.springiocdemo.beans.ProviderPrototypeBean;
import com.workshop.springiocdemo.beans.ProviderSingletonBean;

@Configuration
public class ProviderConfiguration {

	@Bean
	public ProviderSingletonBean getSingle(){
		
		return new ProviderSingletonBean();
	}
	@Bean
	public ProviderPrototypeBean getPrototype(){
		
		return new ProviderPrototypeBean();
	}
}
