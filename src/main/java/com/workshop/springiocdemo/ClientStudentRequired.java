package com.workshop.springiocdemo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;

import com.workshop.springiocdemo.beans.StudentRequiredBean;
import com.workshop.springiocdemo.config.StudentRequiredConfiguration;

public class ClientStudentRequired {

	public static void main(String[] args) {
		  ApplicationContext ctx = new AnnotationConfigApplicationContext(StudentRequiredConfiguration.class);
		   
		  StudentRequiredBean studentRequiredBean = ctx.getBean(StudentRequiredBean.class);
		  System.out.println(studentRequiredBean.getName());
		  System.out.println(studentRequiredBean.getAge());
	}

}
