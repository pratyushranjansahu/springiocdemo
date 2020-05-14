package com.workshop.springiocdemo;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.core.env.Environment;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;

import com.workshop.springiocdemo.beans.MovieModel;
import com.workshop.springiocdemo.service.MovieService;

@SpringBootApplication
@EnableAsync
public class SpringiocdemoApplication implements CommandLineRunner{
	 private static final Logger LOG = LoggerFactory.getLogger(SpringiocdemoApplication.class);

	@Autowired
	private Environment environment;
	@Autowired
	private  MovieService movieService;
	@Bean
	ValueBean myBean() {
		return new ValueBean();
	}
	

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(SpringiocdemoApplication.class, args);
		ValueBean myBean = context.getBean(ValueBean.class);
		myBean.startApplication();
	
	}
	


	private static class ValueBean {

		@Value("${app.title}")
		private String appTitle;

		public void startApplication() {
			System.out.printf("-- running application: %s --%n", appTitle);

		}
	}
	

	@Override
	public void run(String... args) throws Exception {
		System.out.println("Printing Value using Environmental Value : "+environment.getProperty("app.title"));
		
		//Start the clock
        long start = System.currentTimeMillis();

        // Kick of multiple, asynchronous lookups
        CompletableFuture<MovieModel> page1 = movieService.lookForMovie("58611129-2dbc-4a81-a72f-77ddfc1b1b49");
        CompletableFuture<MovieModel> page2 = movieService.lookForMovie("2baf70d1-42bb-4437-b551-e5fed5a87abe");
        CompletableFuture<MovieModel> page3 = movieService.lookForMovie("4e236f34-b981-41c3-8c65-f8c9000b94e7");

        // Join all threads so that we can wait until all are done
        CompletableFuture.allOf(page1, page2, page3).join();

        // Print results, including elapsed time
        LOG.info("Elapsed time: " + (System.currentTimeMillis() - start));
        LOG.info("--> " + page1.get());
        LOG.info("--> " + page2.get());
        LOG.info("--> " + page3.get());
	}
	
	 @Bean
	    public Executor asyncExecutor() {
	        ThreadPoolTaskExecutor executor = new ThreadPoolTaskExecutor();
	        executor.setCorePoolSize(2);
	        executor.setMaxPoolSize(2);
	        executor.setQueueCapacity(500);
	        executor.setThreadNamePrefix("JDAsync-");
	        executor.initialize();
	        return executor;
	    }
}
