package com.spring.springIOC;

public class A {
	int a;
	String msg;
	
	public A() {
		System.out.println("A-() def");

	}

	public void setA(int a) {
		System.out.println("A-setA()");
		this.a = a;
	}

	public void setMsg(String msg) {
		System.out.println("A-setMsg()");
		this.msg = msg;
	}

	@Override
	public String toString() {
		return  a + "\t" + msg ;
	}
	
	

}
