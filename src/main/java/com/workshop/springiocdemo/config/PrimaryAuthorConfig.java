package com.workshop.springiocdemo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import com.workshop.springiocdemo.beans.PrimaryAuthorBean;

@Configuration
public class PrimaryAuthorConfig {
	@Bean
	@Primary
	public PrimaryAuthorBean getAuthor1() {
		System.out.println("getAuthor1() is called");

		PrimaryAuthorBean author = new PrimaryAuthorBean();
		author.setFullname("Rajesh Kumar");
		author.setDob("11 December 1982");
		author.setCountry("India");

		return author;
	}

	@Bean
	public PrimaryAuthorBean getAuthor2() {
		System.out.println("getAuthor2() is called");

		PrimaryAuthorBean author = new PrimaryAuthorBean();
		author.setFullname("Kishore Singh");
		author.setDob("05 May 1991");
		author.setCountry("India");

		return author;
	}
}
