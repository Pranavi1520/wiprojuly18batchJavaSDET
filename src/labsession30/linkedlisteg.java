package labsession30;

import java.util.LinkedList;

public class linkedlisteg {

public static void main(String[] args) {
		
		LinkedList<String> al = new LinkedList<String>();
		
        al.add("Ravi");
		
		al.add("ramya");
		
		al.add("priya");
		
		al.add("raju");
		
		al.add("rima");
		
		al.add("Ravi");
		
		al.add(null);
		
		System.out.println(al);
		
		System.out.println(al.get(2));
		
		System.out.println(al.indexOf("raju"));
		
		System.out.println(al.isEmpty());
		
		System.out.println(al.remove(4));
		
		System.out.println(al);
		
		System.out.println(al.set(4, "king"));
		
		System.out.println(al);
		
		System.out.println(al.size());

	}

}
