package atv;

import java.util.ArrayList;

public class Principal {
	public static void main(String[] args) {
		Counter c = new Counter(1);
		
		for(int a = 0; a < 3; a++) {
			ThreadModel t1 = new ThreadModel(c);
			t1.start();
		}
		
	}
}
