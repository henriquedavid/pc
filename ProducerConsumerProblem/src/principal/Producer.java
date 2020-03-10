package principal;

import java.util.ArrayList;
import java.util.Random;

public class Producer {
	ArrayList<Integer> i;
	Counter c;
	
	public Producer(ArrayList<Integer> i, Counter c) {
		this.i = i;
		this.c = c;
	}
	
	public int  insert() {
		int last = c.getNext();
		i.add(last);
		return last;
	}
}
