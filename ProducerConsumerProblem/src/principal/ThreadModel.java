package principal;

import java.util.ArrayList;

public class ThreadModel extends Thread{
	
	ArrayList<Integer> a;
	Producer p;
	Consumer c;
	
	public ThreadModel(Producer p, Consumer c, ArrayList<Integer> a) {
		this.p = p;
		this.a = a;
		this.c = c;
	}
	
	public void run() {
		int v = p.insert();
		c.removeValue(v);
	}

}
