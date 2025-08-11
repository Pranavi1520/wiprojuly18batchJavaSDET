package labsession23;

class Animal {
    public void makeSound() {
        System.out.println("Animal makes a sound");
    }
}
class Cat extends Animal {
    public void makeSound() {
        System.out.println("Meow");
    }
}
public class Question1 {
    public static void main(String[] args) {
        Animal myAnimal = new Animal();
        myAnimal.makeSound(); 

        Cat myCat = new Cat();
        myCat.makeSound(); 
    }
}

