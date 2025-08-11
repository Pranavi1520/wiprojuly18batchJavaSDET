package collection;

import java.util.Set;
import java.util.TreeSet;

public class Inttreeseteg{

public static void main(String[] args) {
		
		Set<Integer> st = new TreeSet<>();
		
		st.add(1);
		
		st.add(2);

		st.add(3);

		st.add(4);
		
		st.add(5);

		st.add(2);

		System.out.println(st);
		
        System.out.println(st);
		
		System.out.println(st.isEmpty());
		
		System.out.println(st.remove(3));
		
		System.out.println(st);
		
		System.out.println(st);
		
		System.out.println(st.size());

	}

}