package atv;

import java.util.concurrent.Semaphore;

public class Fork {
	
	public Semaphore fork_;
	
	public Fork() {
		fork_ = new Semaphore(1);
	}
	
	public void getFork() {
		try {
			fork_.acquire();
		} catch(InterruptedException e) {}
	}
	
	public void leaveFork() {
		fork_.release();
	}
	
	public boolean isAvailable(){
		return fork_.availablePermits() > 0;
	}

}
