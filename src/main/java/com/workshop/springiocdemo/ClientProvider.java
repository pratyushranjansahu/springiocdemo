package com.workshop.springiocdemo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.workshop.springiocdemo.beans.ProviderSingletonBean;
import com.workshop.springiocdemo.config.ProviderConfiguration;

public class ClientProvider {
	public static void main(String[] args) {

		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ProviderConfiguration.class);

		ProviderSingletonBean clientBean = context.getBean(ProviderSingletonBean.class);
		
		clientBean.showMessage();

	}
}
