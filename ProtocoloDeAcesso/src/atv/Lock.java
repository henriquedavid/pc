package atv;

public interface Lock {
	public void requestCS(long pid);
	public void releaseCS(long pid);
}
