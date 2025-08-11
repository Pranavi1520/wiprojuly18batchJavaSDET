package multithreading;

public class Threadsync {
	
	private int c =0; //shraed variable
	
	//sync method to increment counter
	
	public synchronized void inc() {
		
		c++;
	}
	
	public synchronized int get() {
		
		return c;
	}

}