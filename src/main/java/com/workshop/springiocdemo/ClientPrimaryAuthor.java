package com.workshop.springiocdemo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.workshop.springiocdemo.beans.PrimaryAuthorBean;
import com.workshop.springiocdemo.config.PrimaryAuthorConfig;

public class ClientPrimaryAuthor {

	public static void main(String[] args) {
		ApplicationContext ac = new AnnotationConfigApplicationContext(PrimaryAuthorConfig.class);

		PrimaryAuthorBean author1 = ac.getBean(PrimaryAuthorBean.class);
		System.out.println(author1);

	}

}
