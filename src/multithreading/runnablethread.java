package multithreading;

public class runnablethread implements Runnable {
	
	public void run() {
		
		System.out.println("Thread is Running");
		
		System.out.println("Thread"+ Thread.currentThread().getId() + "is running");
		
		
	}

}
