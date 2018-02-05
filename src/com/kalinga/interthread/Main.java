package com.kalinga.interthread;

public class Main {

	public static void main(String[] args) {
		Message m=new Message("m");
	Thread w=new Thread(new Waiter(m));
	Thread n=new Thread(new Notify(m));
	Thread na=new Thread(new NotifyAll(m));
	w.start();
	n.start();
	na.start();
	
	}

}
