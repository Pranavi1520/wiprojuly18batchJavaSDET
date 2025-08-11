//5.Write a program to find the maximum element from an ArrayList of Integers.

package labsession30;

import java.util.*;

public class maxnumeg {
	
public static void main(String[] args) {
        
        ArrayList<Integer> ps = new ArrayList<>();
        
        ps.add(56);
        
        ps.add(77);
        
        ps.add(32);
        
        ps.add(22);
        
        ps.add(19);

        if (ps.isEmpty()) {
        	
            System.out.println("List is empty");
            
        } else {

            int max = Collections.max(ps);
            
            System.out.println("Maximum element");
            
            System.out.println(max);
        }
    }
}

