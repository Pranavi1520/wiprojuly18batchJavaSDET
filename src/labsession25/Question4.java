package labsession25;

import project.Day4.Abstraction1;

class Shape {
	    public double getArea() {
	        return 0.0;
	    }
	}
class Rectangle extends Abstraction1 {
	    private double length;
	    private double width;
	    
	    public Rectangle(double length, double width) {
	        this.length = length;
	        this.width = width;
	    }

	    public double getArea() {
	        return length * width;
	    }
	}

	    public class Question4 {
	    public static void main(String[] args) {
	        
	        Rectangle rect = new Rectangle(10, 6);
	        
	        System.out.println("Area of rectangle: " + rect.getArea());
	    }
}


