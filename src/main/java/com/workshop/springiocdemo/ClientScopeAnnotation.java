package com.workshop.springiocdemo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.workshop.springiocdemo.beans.ScopeAnnotationBean;
import com.workshop.springiocdemo.config.ScopeAnnotationConfiguration;

public class ClientScopeAnnotation {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = 
	            new AnnotationConfigApplicationContext(ScopeAnnotationConfiguration.class);

		ScopeAnnotationBean bean1 = context.getBean("scopeAnnotation", ScopeAnnotationBean.class);
	      bean1.setName("BORAJI");
	      System.out.println(bean1.getName());

	      ScopeAnnotationBean bean2 = context.getBean("scopeAnnotation", ScopeAnnotationBean.class);
	      System.out.println(bean2.getName());
	      System.out.println(bean1==bean2);
	      context.close();

	}

}
