package com.workshop.springiocdemo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.workshop.springiocdemo.beans.QualifierProfileBean;
import com.workshop.springiocdemo.beans.ResourceEmployeeBean;

public class ClientResourceAnnotation {
	public static void main(String[] args) {
		String[] files = new String[] { "resourceannotation.xml" };
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext(files);
		ResourceEmployeeBean employee = (ResourceEmployeeBean) applicationContext.getBean("myemployee", ResourceEmployeeBean.class);
		System.out.println(employee.toString());
	}
}
