package com.workshop.springiocdemo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.workshop.springiocdemo.beans.ConverterBean;
import com.workshop.springiocdemo.config.ConverterConfig;

public class ClientConverterBean {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ConverterConfig.class);

		ConverterBean clientBean = context.getBean(ConverterBean.class);
		System.out.println("Using Converter Seervice");
		clientBean.showLocalDateTime();

	}

}
