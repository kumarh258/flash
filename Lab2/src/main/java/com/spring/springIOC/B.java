package com.spring.springIOC;

public class B {

	int b;
	String str;
	
	public B(int b, String str) {
		System.out.println("B-() 2 args");
		this.b = b;
		this.str = str;
	}
	
	
	@Override
	public String toString() {
		return  b + "\t" + str ;
	}
	
	
}
