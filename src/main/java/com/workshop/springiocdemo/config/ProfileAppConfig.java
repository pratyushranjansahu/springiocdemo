package com.workshop.springiocdemo.config;

import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration

@ComponentScan({ "com.workshop.springiocdemo.config.*" })
public class ProfileAppConfig {

}
