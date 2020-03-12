package atv;

public class Principal {
	public static void main(String [] args) {
		
		System.out.println("---- THREAD STARTS ----");
		LockOK lock = new LockOK();
		
		ThreadCreated t1 = new ThreadCreated(lock);
		//ThreadCreated t2 = new ThreadCreated(lock);
		
		t1.start();
		//t2.start();
		
		for(int i = 0; i < 10; i++) {
			System.out.println("Main.");
		}
		
	}
}
