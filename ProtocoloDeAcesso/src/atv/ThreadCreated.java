package atv;

public class ThreadCreated extends Thread{
	
	private LockOK lock;
	
	public ThreadCreated(LockOK l) {
		this.lock = l;
	}
	
	public void run() {
		int i = 0;
		while (i < 10) {
			System.out.println("Thread "+ this.getId());
			lock.requestCS(this.getId());
			// Critical Section
			lock.releaseCS(this.getId());
			// Non Critical Section
			i++;
		}
	}

}
