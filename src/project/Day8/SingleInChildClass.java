package project.Day8;

import project.Day5.SingleInSuperClass;

public class SingleInChildClass extends SingleInSuperClass{
		
		String model = "Mustang";
		
		public void display() {
			
			String brand = "lambo";
			System.out.println("Brand is "+brand);
			System.out.println("model is"+model);
			
			
		}
		public static void main(String[] args) {
			SingleInChildClass obj = new SingleInChildClass();
			obj.start();
			obj.display();	

	}

}
