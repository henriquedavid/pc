package atv;

public class LockOK implements Lock{

	private long pid_using;
	
	public LockOK() {
		pid_using = 0;
	}
	
	@Override
	public void requestCS(long pid) {
		if(pid_using == 0) {
			this.pid_using = pid;
			System.out.println("Thread " + pid_using + " making requisitions.");
		} else {
			System.out.println("Thread " + pid_using + " needs to release.");
			while(pid_using != 0) {
				// Do nothing, just wait.
			}
			requestCS(pid);
		}
	}

	@Override
	public void releaseCS(long pid) {
		if(pid_using == pid) {
			this.pid_using = 0;
			System.out.println("Thread " + pid + " released.");
		}
	}
}
