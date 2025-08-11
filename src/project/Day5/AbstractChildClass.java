package project.Day5;

public class AbstractChildClass extends AbstractClass{
	
	void makesound() {
		System.out.println("Animals makes sound");
	}
	
	public static void main(String[] args) {
		AbstractChildClass obj=new AbstractChildClass();
		obj.eat();
		obj.makesound();
		System.out.println(animalName);
	}
}