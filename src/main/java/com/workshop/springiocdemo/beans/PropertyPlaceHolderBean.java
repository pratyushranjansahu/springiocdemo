package com.workshop.springiocdemo.beans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
@Configuration
public class PropertyPlaceHolderBean {
	  @Value("${app.title}")
	  private String userName;
}
