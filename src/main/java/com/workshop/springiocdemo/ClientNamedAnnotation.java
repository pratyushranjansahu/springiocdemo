package com.workshop.springiocdemo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.workshop.springiocdemo.beans.NamedEmployeeService;
import com.workshop.springiocdemo.config.ComponentScanConfig;

public class ClientNamedAnnotation {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext();
		ctx.register(ComponentScanConfig.class);
		ctx.refresh();
		NamedEmployeeService service = ctx.getBean(NamedEmployeeService.class);
		System.out.println("From Named Main");
		System.out.println(service.getEmployee().getEmpMsg());
		ctx.close();
	}
}
