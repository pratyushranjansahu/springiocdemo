package com.workshop.springiocdemo.config;

import java.math.BigDecimal;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.workshop.springiocdemo.beans.GenericRateCalculator;
import com.workshop.springiocdemo.beans.GenericRateFormatter;

@Configuration
public class GenericAutowiredConfig {
	@Bean
	public GenericRateFormatter<Integer> integerRateFormatter() {
		return new GenericRateFormatter<Integer>();
	}

	@Bean
	public GenericRateFormatter<BigDecimal> bigDecimalRateFormatter() {
		return new GenericRateFormatter<BigDecimal>();
	}

	@Bean
	public GenericRateCalculator rateCalculator() {
		return new GenericRateCalculator();
	}
}
