package collection;

import java.util.HashSet;

public class hashseteg {

	public static void main(String[] args) {
	
        HashSet<String> col = new HashSet<>();

        col.add("blue");
        col.add("pink");
        col.add("brown");
        col.add("green");
        col.add("yellow");
        col.add(null);
        col.add(null);
        
        System.out.println(col);
        
        System.out.println(col.isEmpty());
		
		System.out.println(col.remove("brown"));
		
		System.out.println(col);
		
		System.out.println(col.size());
	}

}
