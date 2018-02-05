package com.kalinga.sync;

public class Counter {
private int count=0;

Counter(){
	
}

public void wow(){
	for(int j=0;j<100;j++){
		count++;
	}
	
}

public int getCount() {
	return count;
}

public void setCount(int count) {
	this.count = count;
}

}
