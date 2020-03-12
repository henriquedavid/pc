package atv;

import java.util.Random;

public class Philosopher extends Thread{

	int ref;
	Fork left;
	Fork right;
	
	public Philosopher(int ref, Fork l, Fork r) {
		this.ref = ref;
		left = l;
		right = r;
	}
	
	public void run() {
		while(true) {
			think();
			left.getFork();
			try {
			this.sleep(1000);
			} catch(InterruptedException e) {}
			right.getFork();
			eat();
			left.leaveFork();
			right.leaveFork();
		}
	}
	
	public void think() {
		Random r = new Random();
		System.out.println("Philosopher " + ref + " is thinking...");
		try {
			this.sleep(r.nextInt((7000-0) + 1 ) + 0);
		} catch(InterruptedException e) {}
	}
	
	public void eat() {
		Random r = new Random();
		System.out.println("Philosopher " + ref + " is eating...");
		try {
			this.sleep(r.nextInt((7000-0) + 1 ) + 0);
		} catch(InterruptedException e) {}
	}
}
