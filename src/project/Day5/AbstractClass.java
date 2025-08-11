package project.Day5;

abstract class AbstractClass {
	
	//abstaract methods - no body
	
	abstract void makesound();
	
	//concrete methods
	
	public void eat() {
		 System.out.println("The animal eats food");
	}
	//consatructor
	
	AbstractClass(){
		
		System.out.println("creating construtor in ab calls");
		
	}
	//instance variables
	
	public static String animalName = "Lion";
	
	//final variable
	
	private final String animalBehaviour = "roars";
	
}
