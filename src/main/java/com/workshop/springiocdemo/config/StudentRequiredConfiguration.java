package com.workshop.springiocdemo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.workshop.springiocdemo.beans.StudentRequiredBean;
@Configuration
public class StudentRequiredConfiguration {
	@Bean
	public StudentRequiredBean studentBean() {
		StudentRequiredBean studentRequiredBean=new StudentRequiredBean();
		studentRequiredBean.setAge(26);
		studentRequiredBean.setName("Ram");
		return studentRequiredBean;
	}
}
