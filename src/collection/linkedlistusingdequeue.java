package collection;

import java.util.Deque;
import java.util.LinkedList;

public class linkedlistusingdequeue {

public static void main(String[] args) {

            Deque<String> lang = new LinkedList<String>();
			
            lang.add("python");
			
			lang.add("java");
			
			lang.add("c");
			
			lang.add("c++");
			
			System.out.println(lang);
			
			//addfirst the first element
			lang.addFirst("maven");
			System.out.println(lang);
		    
			//offerFirst
			lang.offerFirst("Html");
			System.out.println(lang);

			//add last
			lang.addLast("apache");
			System.out.println(lang);

			//offer last
			lang.offerLast("shark");
			System.out.println(lang);

			//remove first
			lang.removeFirst();
			System.out.println(lang);

			//poll first
			lang.pollFirst();
			System.out.println(lang);

			//remove last
			lang.removeLast();
			System.out.println(lang);

			//poll last
			lang.pollLast();
			System.out.println(lang);
			
			//get first
			lang.getFirst();
			System.out.println(lang);

			//get last
			lang.getLast();
			System.out.println(lang);

			//peek first
			lang.peekFirst();
			System.out.println(lang);

			//peek last
			lang.peekLast();
			System.out.println(lang);

			
		}

	}