package labsessionaug1;

import java.io.File;
import java.io.FileInputStream;

public class bytearray {
	
	    public static void main(String[] args) {
	    	
	        try {
	        	
	            File In = new File("C://Users//pranavi//Downloads//handling2.txt");

	            FileInputStream sf = new FileInputStream(In);

	            byte[] bytes = new byte[(int) In.length()];

	            sf.read(bytes);
	            
	            System.out.println(new String(bytes));

	            sf.close(); 

	        } catch (Exception e) {
	        	
	            System.out.println(e);
	        }
	    }
	}

	