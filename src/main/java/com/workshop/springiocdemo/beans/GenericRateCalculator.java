package com.workshop.springiocdemo.beans;

import java.math.BigDecimal;

import org.springframework.beans.factory.annotation.Autowired;

public class GenericRateCalculator {
	@Autowired
    private GenericRateFormatter<BigDecimal> formatter;

    public void calculate() {
        BigDecimal rate = new BigDecimal(Math.random() * 100);
        System.out.println(formatter.format(rate));
    }
}
