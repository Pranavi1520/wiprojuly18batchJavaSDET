package project.Day4;

abstract class Shape {
    abstract double calculateArea(); 
}

class Circle extends Shape {
    double r = 2;

   
    public double calculateArea() {
        return Math.PI * r * r;
    }
}

class Rectangle extends Shape {
    double length = 20;
    double width = 90;

   
    public double calculateArea() {
        return length * width;
    }
}

public class Abstraction1 {
    public static void main(String[] args) {
        Circle circle = new Circle();
        Rectangle rectangle = new Rectangle();

        System.out.println("Area of Circle: " + circle.calculateArea());
        System.out.println("Area of Rectangle: " + rectangle.calculateArea());
    }
}


