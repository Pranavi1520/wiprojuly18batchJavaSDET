package labsession24;

abstract class Vechicle {
	 
	abstract void move();
}
class car extends Vechicle{
	
	void move() {
		
		System.out.println("Car is moving");
	}
}
class bike extends Vechicle{
	
	void move() {
		
		System.out.println("Bike is moving");
	}
	
}
class bus extends Vechicle{
	
	void move() {
		
		System.out.println("Bus is moving");
	}
}
public class Abstraction2{
	public static void main(String[] args) {
		
		car mycar=new car();
		
		bike mybike=new bike();
		
		bus mybus=new bus();
		
		mycar.move();
		mybike.move();
		mybus.move();

	}

}
