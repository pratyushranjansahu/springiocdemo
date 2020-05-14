package com.workshop.springiocdemo.beans;

public class LazyBeanTwo {
	public LazyBeanTwo() {
		System.out.println("BeanTwo Initialized");
	}

	public void doSomthing() {
		System.out.println("Inside doSomthing() method of BeanTwo");
	}
}
