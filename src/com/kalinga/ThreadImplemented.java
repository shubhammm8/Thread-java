package com.kalinga;

public class ThreadImplemented implements Runnable{

	@Override
	public void run() {
		System.out.println("Hi i m  a runnable thread "+Thread.currentThread());
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("i m back "+Thread.currentThread());
	}

}
