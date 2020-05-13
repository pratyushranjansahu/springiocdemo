package com.workshop.springiocdemo.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class QualifierProfileBean {
	@Autowired
	@Qualifier("student1")
	private QualifierStudentBean student;

	public QualifierProfileBean(){
	      System.out.println("Inside QualifierProfileBean constructor." );
	   }

	public void printAge() {
		System.out.println("Age : " + student.getAge());
	}

	public void printName() {
		System.out.println("Name : " + student.getName());
	}
}
