package com.kalinga;

public class ThreadExtended extends Thread{
	
	ThreadExtended(String name){
		super(name);
	}
	public void run(){
		
		System.out.println("Hi i m thread and i m running"+Thread.currentThread());
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("i m back "+Thread.currentThread());		
	}

}
