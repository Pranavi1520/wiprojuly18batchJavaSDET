//5.write a java program to print the entered number in reverse?

package labsession31;

public class reversenumeg {

	public static void main(String[] args) {
		
	        int Re = 475327875;
	        
	        int Re1 = 0;

	        while (Re != 0) {
	        	
	            int nb = Re % 10;
	            
	            Re1 = Re1 * 10 + nb;
	            
	            Re = Re / 10;
	        }

	        System.out.println("Reversed number");
	        
	        System.out.println(Re1);
	    }
	}
