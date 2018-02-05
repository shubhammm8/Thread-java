package com.kalinga.interthread;

public class NotifyAll implements Runnable{

	private Message msg;
NotifyAll(Message m){
	msg=m;
}
	@Override
	public void run() {
		
		synchronized(msg){
			try {
				
				msg.setName("Billu lampak");
				
				Thread.sleep(2000);
				msg.notifyAll();
				System.out.println("notified to alll");
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
			
			
		}
	}
	
}
