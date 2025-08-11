//3.Write a program to find the second-largest element in an ArrayList of Integers.

package labsession30;

import java.util.*;

public class secondlagresteg {
	
public static void main(String[] args) {
        
        ArrayList<Integer> st = new ArrayList<>();
        
        st.add(70);
        
        st.add(48);
        
        st.add(54);
        
        st.add(90);
       
        Set<Integer> us = new HashSet<>(st);

        if (us.size() < 2) {
        	
            System.out.println("No elements ");
            
            return;
        }

        List<Integer> sl = new ArrayList<>(us);
        
        Collections.sort(sl, Collections.reverseOrder());

        System.out.println("Second largest element");
        
        System.out.println(sl.get(1));
    }
}

