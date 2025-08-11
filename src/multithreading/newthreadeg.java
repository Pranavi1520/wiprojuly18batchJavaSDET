package multithreading;

public class newthreadeg extends Thread {

	// create a thread using the thread class
	
	     public void run() {
	    	 
	    	 System.out.println("Thread is running");
	     }
	     
}

class Test{
	
	public static void main(String[] args) {
		
		newthreadeg t1 = new newthreadeg();
		
		t1.start();

		
	}

}
class Test1{
	
	public static void main(String[] args) {
		
		newthreadeg t1 = new newthreadeg();
		
		t1.start();

		
	}

}
