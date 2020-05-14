package com.workshop.springiocdemo;

import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.workshop.springiocdemo.beans.LazyBeanOne;
import com.workshop.springiocdemo.config.LazyBeanConfiguration;

public class ClientLazyBean {
	
	public static void main(String[] args) {
		 AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(LazyBeanConfiguration.class);
	      //Initialize lazy bean
		  LazyBeanOne bean=context.getBean(LazyBeanOne.class);
	      bean.doSomthing();
	      context.close();

	}

}
