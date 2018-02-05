package com.kalinga.sync;

public class NoSync implements Runnable{
	private Counter c;
NoSync(){
	
}
	@Override
	public void run() {
		synchronized(c){
			c.wow();

}
		System.out.println("count - "+c.getCount());
	}

}
	
	

