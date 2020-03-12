package principal;

import java.util.ArrayList;

public class Principal {
	public static void main(String [] args) {
		
		ArrayList<Integer> valor = new ArrayList<Integer>();
		Counter c = new Counter(0);
		
		
		/*
		 * The object is that we add an item and then we delete it,
		 * the valor array is always empty and without error if everything
		 * works fine.
		 * 
		 * */
		
		Producer p1 = new Producer(valor, c);
		p1.start();
		Producer p2 = new Producer(valor, c);
		p2.start();
		Producer p3 = new Producer(valor, c);
		p3.start();
		Consumer c1 = new Consumer(valor, c);
		c1.start();
		Consumer c2 = new Consumer(valor, c);
		c2.start();
		Consumer c3 = new Consumer(valor, c);
		c3.start();
		
		while(true){
			/*System.out.print("[ ");
			for(int j = 0; j < valor.size(); j++) {
				System.out.print( valor.get(j) +  " ");
			}
			System.out.println("]");*/
		}
	}
}
