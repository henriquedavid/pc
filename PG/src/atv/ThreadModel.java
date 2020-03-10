package atv;

public class ThreadModel extends Thread{

	Counter i;
	
	public ThreadModel(Counter i) {
		this.i = i;
	}
	
	public void run() {
		
		for(int a = 0; a < 1000; a++) {
			synchronized (i) {
				System.out.println(this.getId() + " - " + i.getNext());
			}
			try {
				this.sleep(1);
			} catch(InterruptedException e) {
			}
		}
	}
}
