package principal;

import java.util.ArrayList;
import java.util.Random;

/**
 * 
 * @author henriquedavid
 * 
 * The producer insert elements in the vector.
 * 
 */
public class Producer extends Thread{
	ArrayList<Integer> i;
	Counter c;
	
	public Producer(ArrayList<Integer> i, Counter c) {
		this.i = i;
		this.c = c;
	}
	
	public void run() {
		System.out.println("ENTROU!");
		int q = 100;
		while(q != 0) {
			i.add(c.get());
			c.nextInt();
			q--;
		}
	}
}
