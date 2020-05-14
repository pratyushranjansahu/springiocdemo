package com.workshop.springiocdemo.beans;

public class LazyBeanOne {
	public LazyBeanOne() {
		System.out.println("BeanOne Initialized");
	}

	public void doSomthing() {
		System.out.println("Inside doSomthing() method ofBeanOne");
	}
}
