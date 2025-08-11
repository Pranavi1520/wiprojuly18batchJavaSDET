package project.Day5;

class An{
	public void eat() {
		System.out.println("Animals eat food");
	}
}
//subclass1
class Dog extends An{
	public void bark() {
		System.out.println("Dog braks");
	}
}

//subclass2
class Cat extends An{
	public void meow() {
		System.out.println("Cat Meow");
	}
}
//subclass3
class Cow extends An{
	public void moo() {
		System.out.println("Cow moo");
	}
}

//main class
class Animal {
	
	public static void main(String[] args) {
		Dog d = new Dog();
		
		d.eat();
		d.bark();
		
        Cat c = new Cat();
		
		c.eat();
		c.meow();
		
        Cow cw = new Cow();
		
		cw.eat();
		cw.moo();
		
	}

}
