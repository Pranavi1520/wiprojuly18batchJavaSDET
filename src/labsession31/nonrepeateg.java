//3.Write a Java Program to print the first non repeating character in a given String.

package labsession31;

public class nonrepeateg {

	    public static void main(String[] args) {
	    	
	        String st = "Reethu";

	        for (int i = 0; i < st.length(); i++) {
	        	
	            char ch = st.charAt(i);
	            
	            boolean BL = true;

	            for (int j = 0; j < st.length(); j++) {
	            	
	                if (i != j && ch == st.charAt(j)) {
	                	
	                    BL = false;
	                    
	                    break;
	                }
	            }

	            if (BL) {
	            	
	                System.out.println("First non-repeating character");
	                
	                System.out.println(ch);
	                
	            }
	        }

	  }
}