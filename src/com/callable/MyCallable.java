package com.callable;

import java.util.concurrent.Callable;

public class MyCallable implements Callable{
	
	int num;
	
	MyCallable(int num){
		this.num=num;
	}

	@Override
	public Object call() throws Exception {
		
		System.out.println("Thread "+Thread.currentThread().getName()+" is performing "
				+" with "+num);
		int sum=0;
		for(int i=0 ; i<num; i++) {
			 sum = sum+i;
		}
		Thread.sleep(5000);
		return sum;	
		
	}
}
