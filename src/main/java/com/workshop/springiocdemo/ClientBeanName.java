package com.workshop.springiocdemo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.workshop.springiocdemo.beans.BeanNameHelloMessage;
import com.workshop.springiocdemo.config.BeanNamedConfiguration;

public class ClientBeanName {

	public static void main(String[] args) {
		ApplicationContext ctx = new AnnotationConfigApplicationContext(BeanNamedConfiguration.class);

		BeanNameHelloMessage msgBean1 = ctx.getBean(BeanNameHelloMessage.class);
		System.out.println(msgBean1.getMessage());

		BeanNameHelloMessage msgBean2 = (BeanNameHelloMessage) ctx.getBean("myMessage");

		System.out.println(msgBean2.getMessage());


	}

}
