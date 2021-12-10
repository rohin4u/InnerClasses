package com.watch;


public class Outer {
	
	public class Inner {
		
		public void m1() {
			System.out.println("inside inner class");
		}
		
		
		
	}

	public static void main(String[] args) {
		Outer o = new Outer();
		Outer.Inner i = o.new Inner();
		i.m1();
		
	}

}

