package com.workshop.springiocdemo;

import org.springframework.beans.BeansException;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.workshop.springiocdemo.config.ComponentScanConfig;
import com.workshop.springiocdemo.util.CalcUtil;

public class ClientIncludeExcludeFilters {

	public static void main(String[] args) {
		 AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext();
		    ctx.register(ComponentScanConfig.class);
		    ctx.refresh();
		    try {
				CalcUtil calc = ctx.getBean(CalcUtil.class);
				System.out.println("Addition:" +calc.addNumbers(15,30));
		    }catch(BeansException be) {
		    	        System.out.println(be.getMessage());
		    }

	}

}
