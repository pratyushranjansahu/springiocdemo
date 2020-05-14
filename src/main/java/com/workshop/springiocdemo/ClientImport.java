package com.workshop.springiocdemo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.workshop.springiocdemo.beans.ImportABean;
import com.workshop.springiocdemo.beans.ImportBBean;
import com.workshop.springiocdemo.config.ImportOneConfiguration;

public class ClientImport {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext();
		ctx.register(ImportOneConfiguration.class);
		ctx.refresh();
		ImportABean a=(ImportABean)ctx.getBean("a");
		ImportBBean b=(ImportBBean)ctx.getBean("b");
		a.doWork();
		b.doWork();
		ctx.registerShutdownHook();
	}

}
