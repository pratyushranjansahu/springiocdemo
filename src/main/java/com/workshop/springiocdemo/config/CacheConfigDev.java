package com.workshop.springiocdemo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.workshop.springiocdemo.beans.NamedEmployee;
@Configuration
@Profile("dev")
public class CacheConfigDev {
	public  CacheConfigDev(){
		System.out.println("Dev Profile");
	}
	@Bean
    public NamedEmployee concurrentMapCacheManager() {
		
        return new NamedEmployee();
    }
}
