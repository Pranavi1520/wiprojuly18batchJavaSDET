//4.Write a program to check iftwo LinkedLists are equal.

package collection;

import java.util.*;

public class equalnotqualeg {
	
public static void main(String[] args) {
        
        LinkedList<String> rs = new LinkedList<>();
        
        rs.add("pink");
        
        rs.add("green");
        
        rs.add("yellow");
        
        rs.add("blue");

        LinkedList<String> rs1 = new LinkedList<>();
        
        rs1.add("pink");
        
        rs1.add("green");
        
        rs1.add("yellow");
        
        rs1.add("blue");
        
        rs1.add("white");

        boolean areEqual = rs.equals(rs1);

        if (areEqual) {
        	
            System.out.println("Lists are equal");
            
        } else {
        	
            System.out.println("Lists are NOT equal");
        }
    }
}
