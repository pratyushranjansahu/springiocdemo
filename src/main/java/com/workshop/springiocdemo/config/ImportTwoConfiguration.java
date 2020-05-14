package com.workshop.springiocdemo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.workshop.springiocdemo.beans.ImportABean;
@Configuration
public class ImportTwoConfiguration {
	@Bean(name="a")
	public ImportABean a(){
		return new ImportABean();
	}
}
