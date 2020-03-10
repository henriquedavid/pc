package atv;

public class Counter {
	Integer i;
	
	public Counter(Integer i) {
		this.i = i;
	}
	
	public Integer getNext() {
		return i++;
	}
}
