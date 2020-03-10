package principal;

import java.util.ArrayList;

public class Principal {
	public static void main(String [] args) {
		
		ArrayList<Integer> valor = new ArrayList<Integer>();
		Counter c = new Counter(1);
		
		for(int i = 0 ; i < 3; i++) {
			Producer p = new Producer(valor, c);
		}
		
	}
}
