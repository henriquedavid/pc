package principal;

import java.util.ArrayList;

public class Consumer {
	
	ArrayList<Integer> v;
	Counter c;
	
	public Consumer(ArrayList<Integer> value, Counter c) {
		this.v = value;
		this.c = c;
	}
	
	public void removeValue(Integer c) {
		v.remove(c);
		System.out.println("Removido!");
	}

}
