package collection;

import java.util.LinkedList;
import java.util.Queue;

public class linkedlistusingqueue {

	public static void main(String[] args) {

		Queue<String> lang = new LinkedList<String>();
		
		lang.add("python");
		
		lang.add("java");
		
		lang.add("c");
		
		lang.add("c++");
		
		System.out.println(lang);
		
		//access the first element
		System.out.println(lang.peek());
		
		//remove
		System.out.println(lang.remove("c"));
		System.out.println(lang);

		//poll
		System.out.println(lang.poll());
		
	}

}
