package labsessionaug2;

public class sumprime {

	    public static void main(String[] args) {
	    	
	        int start = 1;
	        
	        int end = 50;
	        
	        int a = (start + end) / 2;

	        SumThread t1 = new SumThread(start, a);
	        
	        SumThread t2 = new SumThread(a + 1, end);

	        t1.start();
	        
	        t2.start();

	    }
	}