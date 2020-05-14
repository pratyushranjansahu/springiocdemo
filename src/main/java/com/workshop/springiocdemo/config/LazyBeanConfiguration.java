package com.workshop.springiocdemo.config;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.InjectionPoint;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;

import com.workshop.springiocdemo.beans.LazyBeanOne;
import com.workshop.springiocdemo.beans.LazyBeanTwo;

@Configuration
public class LazyBeanConfiguration {
	@Bean("beanOne")
	@Lazy(value = true)
	public LazyBeanOne getBeanOne() {
		return new LazyBeanOne();
	}

	@Bean("beanTwo")
	public LazyBeanTwo getBeanTwo() {
		return new LazyBeanTwo();
	}

}
