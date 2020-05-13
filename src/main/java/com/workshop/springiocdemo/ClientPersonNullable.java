package com.workshop.springiocdemo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;

import com.workshop.springiocdemo.beans.PersonNullableBean;
import com.workshop.springiocdemo.beans.StudentRequiredBean;
import com.workshop.springiocdemo.config.PersonNullableConfiguration;
import com.workshop.springiocdemo.config.StudentRequiredConfiguration;

public class ClientPersonNullable {

	public static void main(String[] args) {
		  ApplicationContext ctx = new AnnotationConfigApplicationContext(PersonNullableConfiguration.class);
		   
		  PersonNullableBean personNullableBean = ctx.getBean(PersonNullableBean.class);
		  System.out.println(personNullableBean.getNickName());

	}

}
