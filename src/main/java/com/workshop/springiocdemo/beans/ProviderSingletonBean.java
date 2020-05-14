package com.workshop.springiocdemo.beans;

import javax.inject.Provider;

import org.springframework.beans.factory.annotation.Autowired;

public class ProviderSingletonBean {
	@Autowired
    private Provider<ProviderPrototypeBean> myPrototypeBeanProvider;

    public void showMessage () {
    	ProviderPrototypeBean bean = myPrototypeBeanProvider.get();
        System.out.println("Printing message of Prototype using Provider : " + bean.getDetails());
    }
}
