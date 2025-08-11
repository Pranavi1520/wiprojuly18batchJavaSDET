//1.Create a set  and  find Duplicate Elements in set


package labsession30;

import java.util.*;

public class duplicateseteg {
	
public static void main(String[] args) {
    	
    	ArrayList<String> al = new ArrayList<String>();
    	
        al.add("car");
        
        al.add("brand");
        
        al.add("model");
        
        al.add("brand");
        
        al.add("year");
        
        al.add("date");
        
        al.add("year");

        Set<String> al2 = new HashSet<>();

        Set<String> duplicates = new HashSet<>();

        for (String al1 : al) {
        	
            if (!al2.add(al1)) {
            	
                duplicates.add(al1);
            }
        }

        System.out.println("List"); 
        
        System.out.println(al);

        System.out.println("Duplicate Elements" );
        
        System.out.println(duplicates);
    }
}
