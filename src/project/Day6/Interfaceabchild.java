package project.Day6;

import project.Day12.InterfaceB;

public class Interfaceabchild implements InterfaceA,InterfaceB{
	
	public void display() {
        System.out.println("Displaying from Interfaceabchild");
    }

        public static void main(String[] args) {
		
		Interfaceabchild AB = new Interfaceabchild();
		AB.display();
		InterfaceA.display();
		InterfaceB.display();

	}
}



