package project.Day7;

public class StringBulilderEg {
		public static void main(String[] args) {
	        StringBuilder sb = new StringBuilder("Hello");
	        sb.append(" World");
	        sb.insert(5, ",");
	        sb.replace(0, 5, "Hi");
	        sb.delete(3, 5);
	        sb.reverse();
	        System.out.println(sb);  
	    }
}
