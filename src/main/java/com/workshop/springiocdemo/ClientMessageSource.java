package com.workshop.springiocdemo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.workshop.springiocdemo.beans.MessageSourceBean;

public class ClientMessageSource {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext(
				new String[] { "locale.xml", "Spring-Customer.xml" });

		MessageSourceBean cust = (MessageSourceBean) context.getBean("customerService");
		cust.printMessage();

	}

}
