package com.workshop.springiocdemo.config;

import java.util.Date;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.convert.ConversionService;
import org.springframework.core.convert.support.DefaultConversionService;

import com.workshop.springiocdemo.beans.ConverterBean;
import com.workshop.springiocdemo.beans.DateToLocalDateTimeConverter;

@Configuration
public class ConverterConfig {
	@Bean
    public ConversionService conversionService () {
        DefaultConversionService service = new DefaultConversionService();
        service.addConverter(new DateToLocalDateTimeConverter());
        return service;
    }

    @Bean
    public ConverterBean clientBean () {
        return new ConverterBean(new Date());
    }
}
