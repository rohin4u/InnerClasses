package com.spiderscrawl;

public class Outer {
	
	public class Inner {
		
		public void m1() {
			System.out.println("inside inner class");
		}
		
		
		
	}
	public void m2() {
		Inner i = new Inner();
		i.m1();
	}

	public static void main(String[] args) {
		Outer o = new Outer();
		o.m2();
		
	}

}
