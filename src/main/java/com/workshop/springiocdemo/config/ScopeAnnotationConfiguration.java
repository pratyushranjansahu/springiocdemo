package com.workshop.springiocdemo.config;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import com.workshop.springiocdemo.beans.ScopeAnnotationBean;
@Configuration
public class ScopeAnnotationConfiguration {
	@Bean("scopeAnnotation")
	@Scope(value = ConfigurableBeanFactory.SCOPE_PROTOTYPE)
	public ScopeAnnotationBean getScopeAnnotation() {
		return new ScopeAnnotationBean();
	}
}
