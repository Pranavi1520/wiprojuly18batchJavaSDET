package labsession23;

class vehicle {
	    public void drive() {
	        System.out.println("Driving a vehicle");
	    }
}
class Car extends vehicle {
	    public void drive() {
	        System.out.println("Repairing a car");
	    }
}
public class Question2{
	    public static void main(String[] args) {
	        vehicle myvehicle = new vehicle();
	        myvehicle.drive();  

	        Car c = new Car();
	        c.drive();  
	    }
}

