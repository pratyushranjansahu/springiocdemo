package com.workshop.springiocdemo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.workshop.springiocdemo.beans.QualifierProfileBean;

public class ClientQualifierAnnotation {
	public static void main(String[] args) {
		String[] files = new String[] { "qualifierannotation.xml" };
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext(files);
		QualifierProfileBean profile = (QualifierProfileBean) applicationContext.getBean("profile");
	      profile.printAge();
	      profile.printName();
	}
}
