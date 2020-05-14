package com.workshop.springiocdemo;

import org.springframework.context.ApplicationListener;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.event.ContextRefreshedEvent;

public class ClientApplicationListner {

	@Bean
	AListenerBean listenerBean() {
		return new AListenerBean();
	}

	public static void main(String[] args) {

		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(
				ClientApplicationListner.class);

	}

	private static class AListenerBean implements ApplicationListener<ContextRefreshedEvent> {

		@Override
		public void onApplicationEvent(ContextRefreshedEvent event) {
			System.out.print("context refreshed event fired: ");
			System.out.println(event);
		}
	}

}
