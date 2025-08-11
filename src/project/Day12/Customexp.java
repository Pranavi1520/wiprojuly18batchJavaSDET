package project.Day12;

public class Customexp {

	public static void checkage(int age) throws Exception{
		
		if(age<18) {
			
			System.out.println("create a new exception");
			
			Thread.sleep(5000);
			
			//using throw keyword
			
			throw new Exception("Age must be 18 or older to vote");
			
		}else{
			
			System.out.println("person is not eligible for voting");
		}

	}

}
