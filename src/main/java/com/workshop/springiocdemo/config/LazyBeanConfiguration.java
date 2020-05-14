package com.workshop.springiocdemo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;

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
