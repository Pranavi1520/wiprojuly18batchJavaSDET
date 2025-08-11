package multithreading;

public class UsesyncClass {

	public static void main(String[] args) throws InterruptedException {

		Threadsync cnt = new Threadsync();
		
		//thread 1 t1 increment the counter
		
		Thread t1 = new Thread(()->{
			
			for (int i = 0;i<1000;i++) {
				
				cnt.inc();
			}
		});
		
		//thread 2 to increment the counter
		
        Thread t2 = new Thread(()->{
			
			for (int i = 0;i<1000;i++) {
				
				cnt.inc();
			}
		});
        
        //start both the threads
        
        t1.start();
        t2.start();
        
        //wait for the threads to finish
        
        t1.join();
        t2.join();
        
        // print the final counter value
        
        System.out.println("counter: " + cnt.get());
	}

}
