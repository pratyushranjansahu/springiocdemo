package com.workshop.springiocdemo.beans;

import java.time.LocalDateTime;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.convert.ConversionService;

public class ConverterBean {
	  @Autowired
	    private ConversionService conversionService;
	    private final Date date;

	    public ConverterBean (Date date) {
	        this.date = date;
	    }

	    public void showLocalDateTime () {
	        LocalDateTime dateTime = conversionService.convert(date, LocalDateTime.class);
	        System.out.println(dateTime);
	    }
}
