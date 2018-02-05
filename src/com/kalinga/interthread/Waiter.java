package com.kalinga.interthread;

public class Waiter implements Runnable{
	private Message m;
	public Waiter(Message n){
		this.m=n;
	}
	@Override
	public void run() {
	synchronized(m){
		
		System.out.println("Thread"+Thread.currentThread());
		try {
			System.out.println(m.getName());
			
			m.wait();
			System.out.println(m.getName());
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	}

}
