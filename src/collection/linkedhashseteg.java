package collection;

import java.util.LinkedHashSet;

public class linkedhashseteg {

public static void main(String[] args) {

		LinkedHashSet<String> cl = new LinkedHashSet<>();

        cl.add("Ravi");
        cl.add("rohit");
        cl.add("shena");
        cl.add("mintu");
        cl.add("boy");
        cl.add("shena");
        cl.add(null);
        cl.add(null);
        
        System.out.println(cl);
        
        System.out.println(cl.isEmpty());
		
		System.out.println(cl.remove("mintu"));
		
		System.out.println(cl);
		
		System.out.println(cl.size());
	}

}
