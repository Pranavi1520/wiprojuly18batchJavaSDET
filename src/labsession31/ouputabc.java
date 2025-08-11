//1.Write a Java Program to generate Output "aabbbcccc" with the input "a2b3c4"

package labsession31;

public class ouputabc {

public static void main(String[] args) {
    	
    	//input string
    	
        String st = "a2b3c4";
        
        StringBuilder ab = new StringBuilder();

        for (int i = 0; i < st.length(); i += 2) {
        	
        	//gets a character from string
        	
            char ch = st.charAt(i);       
           
            int count = st.charAt(i+1) - '0'; 

            for (int j = 0; j < count; j++) {
            	
                ab.append(ch);
            }
        }

        System.out.println("Output");
        
        System.out.println(ab.toString());
    }
}
