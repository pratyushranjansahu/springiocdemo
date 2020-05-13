package com.workshop.springiocdemo;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.workshop.springiocdemo.beans.PropertyPlaceHolderBean;
import com.workshop.springiocdemo.config.PropertyPlaceHolderConfig;

public class ClientPropertyPlaceHolder {

	public static void main(String[] args) {
		 try (ConfigurableApplicationContext context = new AnnotationConfigApplicationContext(PropertyPlaceHolderConfig.class, PropertyPlaceHolderBean.class);) {
			 PropertyPlaceHolderBean dbProperties = context.getBean(PropertyPlaceHolderBean.class);
	         System.out.println("This is Properties: " + dbProperties.toString());
	         
		 }

	}

}
