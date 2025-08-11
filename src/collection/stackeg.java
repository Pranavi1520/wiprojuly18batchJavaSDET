package collection;

import java.util.Stack;

public class stackeg {

	public static void main(String[] args) {

		Stack<String> st = new Stack<>();
		
		st.add("raghu");
		st.add("ravi");
		st.add("tom");
		st.add("jerry");
		
		System.out.println(st);
		
		//empty()
		System.out.println(st.empty());
		
		//peek
		System.out.println(st.peek());
		
		//pop
	    st.pop();
		System.out.println(st);
		
		//push
		System.out.println(st.push("ree"));
		System.out.println(st);

		//search
		System.out.println(st.search("jerry"));

		//capacity
		System.out.println(st.capacity());

		//indexof
		System.out.println(st.indexOf("tom"));
		
		//insertat
		st.insertElementAt("joy", 4);
		System.out.println(st);

		//clear
		st.clear();
		System.out.println(st);


	}

}
