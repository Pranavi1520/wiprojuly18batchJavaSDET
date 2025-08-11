package project.Day11;

import project.Day10.MultilevelInSuperClass;
import project.Day8.SingleInChildClass;

public class MultilevelInChildClass extends MultilevelInSuperClass {

    String model = "Mustang";

    public void display() {
        String brand = "ferrari";
		System.out.println("Brand is " + brand);
        System.out.println("Model is " + model);
        int year = 2003;
		System.out.println("Year is " + year);
    }

    public static void main(String[] args) {
        MultilevelInChildClass obj = new MultilevelInChildClass();
        obj.start();    
        obj.display();  
    }
}