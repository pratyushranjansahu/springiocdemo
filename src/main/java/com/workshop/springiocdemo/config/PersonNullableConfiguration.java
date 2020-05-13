package com.workshop.springiocdemo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.workshop.springiocdemo.beans.PersonNullableBean;
import com.workshop.springiocdemo.beans.StudentRequiredBean;

@Configuration
public class PersonNullableConfiguration {
	@Bean
	public PersonNullableBean personBean() {
		PersonNullableBean personBean=new PersonNullableBean();
		personBean.setNickName("Rocky");
		return personBean;
	}
}
