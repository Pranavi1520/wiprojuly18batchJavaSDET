package project.Day7;

public class Expectionhandling {

	public static void main(String[] args) {
	
		try {
			
			//code where the application logic is residing
			int a = 100;
			
			int b = 0;
			
			int c = a/b;
			
			System.out.println(c);
			
		}catch(ArithmeticException e) {
			
			//print the trace of the exception
			
			System.out.println(e);
		}

	}

}
