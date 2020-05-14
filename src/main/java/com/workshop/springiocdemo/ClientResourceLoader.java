package com.workshop.springiocdemo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.Resource;

import com.workshop.springiocdemo.beans.ResourceLoaderImpl;

public class ClientResourceLoader {

	public static void main(String[] args) {
		ApplicationContext appContext =
		    	   new ClassPathXmlApplicationContext(new String[] {"Spring-resource.xml"});

		    	ResourceLoaderImpl cust =
		           (ResourceLoaderImpl)appContext.getBean("customerService");

		    	Resource resource =
		            cust.getResource("classpath:com/testing.txt");

		    try{
		          InputStream is = resource.getInputStream();
		          BufferedReader br = new BufferedReader(new InputStreamReader(is));

		          String line;
		          while ((line = br.readLine()) != null) {
		     	       System.out.println(line);
		          }
		          br.close();

		    	}catch(IOException e){
		    		e.printStackTrace();
		    	}

	}

}
