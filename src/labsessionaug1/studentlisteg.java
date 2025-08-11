package labsessionaug1;

import java.io.BufferedReader;
import java.io.FileReader;

public class studentlisteg {
	
    public static void main(String[] args) {
    	
        try {
        	
            BufferedReader ip = new BufferedReader(new FileReader("C://Users//pranavi//Downloads//handling1.txt/"));

            String line;
            
            System.out.println("Students list");

            while ((line = ip.readLine()) != null) {
            	
                System.out.println(line);
            }

            ip.close();

        } catch (Exception e) {
        	
        	System.out.println(e);
        	
        }
    }
}
