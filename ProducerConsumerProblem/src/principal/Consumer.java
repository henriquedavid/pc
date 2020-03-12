package principal;

import java.util.ArrayList;

/**
 * 
 * @author henriquedavid
 *
 * The consumer get the values and delete the number that's in the counter.
 */
public class Consumer extends Thread{
	
	ArrayList<Integer> v;
	Counter c;
	
	public Consumer(ArrayList<Integer> values, Counter c) {
		this.v = values;
		this.c = c;
	}
	
	public void run() {
		int q = 100;
		while(q != 0) {
			System.out.println("Removendo " + c.get());
			v.remove(c.get());
			q--;
		}
	}

}
