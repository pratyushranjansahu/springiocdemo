package com.workshop.springiocdemo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.workshop.springiocdemo.beans.GenericRateCalculator;
import com.workshop.springiocdemo.config.GenericAutowiredConfig;

public class ClientGenericAutowired {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(GenericAutowiredConfig.class);
		GenericRateCalculator bean = context.getBean(GenericRateCalculator.class);
		System.out.print("Calculating Rate : ");
		bean.calculate();

	}

}
