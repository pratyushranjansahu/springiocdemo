package com.workshop.springiocdemo.config;

import org.springframework.cache.CacheManager;
import org.springframework.cache.ehcache.EhCacheCacheManager;
import org.springframework.cache.ehcache.EhCacheManagerFactoryBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.core.io.ClassPathResource;

import com.workshop.springiocdemo.beans.NamedEmployee;

@Configuration
@Profile("prod")
public class CacheConfigProd {
	@Bean
    public NamedEmployee concurrentMapCacheManager() {
		
        return new NamedEmployee();
    }
}
