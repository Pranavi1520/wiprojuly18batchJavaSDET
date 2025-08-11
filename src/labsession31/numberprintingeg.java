//4.Write a Java Program to print numbers 1 to 100 without using any loop(for/while/do-while).

package labsession31;

public class numberprintingeg {

	    public static void print(int no) {
	    	
	        if (no > 100) {
	        	
	            return; 
	        }
	        
	        System.out.println(no);
	        
	        print(no + 1); 
	    }

	    public static void main(String[] args) {
	    	
	        print(1); 
	    }
}
