package atv;

public class Principal {
	public static void main(String[] args) {
		Counter c = new Counter(1);
		
		ThreadModel t1 = new ThreadModel(c);
		ThreadModel t2 = new ThreadModel(c);
		
		t1.start();
		t2.start();
	}
}
