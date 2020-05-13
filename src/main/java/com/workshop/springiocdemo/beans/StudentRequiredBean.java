package com.workshop.springiocdemo.beans;

import org.springframework.beans.factory.annotation.Required;
import org.springframework.context.annotation.ComponentScan;

public class StudentRequiredBean {
	private Integer age;
	private String name;

	public Integer getAge() {
		return age;
	}

	@Required
	public void setAge(Integer age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	@Required
	public void setName(String name) {
		this.name = name;
	}

}
