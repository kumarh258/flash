package com.spring.springIOC;

public class Hello {
	
	A aobj;
	B bobj;
	
	public void setAobj(A aobj) {
		System.out.println("Hello-setAobj()");
		this.aobj = aobj;
	}


	public Hello(B bobj) {
		System.out.println("Hello-() 1 args");
		this.bobj = bobj;
	}




	public void show() {
		System.out.println("Hello-show()");
		System.out.println(aobj);
		System.out.println(bobj);
	}

}
