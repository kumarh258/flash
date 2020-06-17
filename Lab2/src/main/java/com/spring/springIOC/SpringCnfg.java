package com.spring.springIOC;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringCnfg {
	
	@Bean("AO")
	public A createA() {
		A ao = new A();
		ao.setA(10);
		ao.setMsg("I am in A");
		
		return ao;
	}
	
	@Bean("BO")
	public B createB() {
		B bo = new B(20, "i am in B");
		
		return bo;
	}
	
	@Bean("hello")
	public Hello createHello(A ao, B bo) {
		Hello hello = new Hello(bo);
		hello.setAobj(ao);
		
		
		return hello;
	}

}
