package com.kalinga.interthread;

public class Notify implements Runnable{
	
	private Message m;
	
	public Notify(Message m){
		this.m=m;
	}

	@Override
	public void run() {
	try {
		synchronized(m){
		
		Thread.sleep(1000);
		m.setName("billu");
		m.notify();
		System.out.println("Notified");
		}
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
		
	}

}
