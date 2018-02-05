package com.kalinga;

public class Main {

	public static void main(String[] args) {
	Thread t1=new Thread(new ThreadExtended("t1"));
	Thread t2=new Thread(new ThreadImplemented());
	
	Thread t3=new Thread(new Runnable(){

		@Override
		public void run() {
		System.out.println("hi I am a Anonymous Class thread "+ Thread.currentThread());
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
			System.out.println("i m back "+Thread.currentThread());
		}
		
		
	});
		
	
	
	Thread t4=new Thread(()-> {System.out.println("hi i m thread with lambda function");
	try {
		long start=System.nanoTime();
		Thread.sleep(1000);
		long end=System.nanoTime();
		System.out.println(" Timing -- "+(end-start));
	} catch (InterruptedException e) {
		
		e.printStackTrace();
	}});
	
	
	t1.start();
	t2.start();
	t3.start();
	t4.start();
		
	
	try{
		t4.join();
		t3.join();
		t2.join();
		t1.join();
	}catch(InterruptedException e){e.printStackTrace();}	
	}

}
