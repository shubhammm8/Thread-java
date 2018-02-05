package com.kalinga.sync;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		NoSync n=new NoSync();
		Thread t1=new Thread(n);
		t1.start();
		Thread t2=new Thread(n);
		
		t2.start();
		
		
		
		
	}

}
