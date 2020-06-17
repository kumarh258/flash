package com.spring.springIOC;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Lab1 {
	
	public static void main(String[] args) {
		
		ApplicationContext ctx = new AnnotationConfigApplicationContext(SpringCnfg.class);
		System.out.println("--------Spring Contaner is Ready to Work--------");
		
		Hello hello = (Hello)ctx.getBean("hello");
		hello.show();
		
	}

}
