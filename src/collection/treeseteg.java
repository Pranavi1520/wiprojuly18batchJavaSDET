package collection;

import java.util.Set;
import java.util.TreeSet;

public class treeseteg {

	public static void main(String[] args) {
		
		Set<String> st = new TreeSet<String>();
		
		st.add("orange");
		
		st.add("banana");

		st.add("grapes");

		st.add("apple");
		
		st.add("pineapple");

		st.add("grapes");

		System.out.println(st);
		
        System.out.println(st);
		
		System.out.println(st.isEmpty());
		
		System.out.println(st.remove("apple"));
		
		System.out.println(st);
		
		System.out.println(st);
		
		System.out.println(st.size());

	}

}
