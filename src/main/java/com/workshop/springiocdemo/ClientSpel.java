package com.workshop.springiocdemo;

import org.springframework.expression.Expression;
import org.springframework.expression.ExpressionParser;
import org.springframework.expression.spel.standard.SpelExpressionParser;

public class ClientSpel {

	public static void main(String[] args) {
		ExpressionParser parser = new SpelExpressionParser();  
		  
		Expression exp = parser.parseExpression("'Hello SPEL'");  
		String message = (String) exp.getValue();  
		System.out.println(message);  
		
		Expression exp1 = parser.parseExpression("'Welcome SPEL'.concat('!')");  
		String message1 = (String) exp1.getValue();  
		System.out.println(message1);  
	}

}
