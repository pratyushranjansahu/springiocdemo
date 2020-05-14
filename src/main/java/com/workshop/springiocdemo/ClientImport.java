package com.workshop.springiocdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;

import com.workshop.springiocdemo.beans.ImportABean;
import com.workshop.springiocdemo.beans.ImportBBean;
import com.workshop.springiocdemo.config.ImportOneConfiguration;

public class ClientImport {

	public static void main(String[] args) {

		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext();
		ctx.register(ImportOneConfiguration.class);
		ctx.refresh();

		ImportABean a = (ImportABean) ctx.getBean("a");
		ImportBBean b = (ImportBBean) ctx.getBean("b");
		a.doWork();
		b.doWork();
		ctx.registerShutdownHook();
	}

}
