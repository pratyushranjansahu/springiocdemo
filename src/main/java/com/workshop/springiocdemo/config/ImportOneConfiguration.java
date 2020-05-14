package com.workshop.springiocdemo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

import com.workshop.springiocdemo.beans.ImportBBean;
@Configuration
@Import(ImportTwoConfiguration.class)
public class ImportOneConfiguration {
	@Bean(name = "b")
	public ImportBBean b() {
		return new ImportBBean();
	}
}
