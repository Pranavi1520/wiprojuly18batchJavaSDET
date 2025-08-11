//2.Create a Arraylist and sort a list of integers

package collection;

import java.util.*;

public class sortedlisteg {
	
public static void main(String[] args) {
        
        ArrayList<Integer> nb = new ArrayList<>();

        nb.add(87);
        
        nb.add(48);
        
        nb.add(54);
        
        nb.add(45);
        
        nb.add(72);

        System.out.println("List");
        
        System.out.println(nb);

        Collections.sort(nb);
        
        System.out.println("Sorted List");
        
        System.out.println(nb);
        
    }
}
