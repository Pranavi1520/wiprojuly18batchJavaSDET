package project.Day6;

import project.Day8.Text;

public class Fonttextchild implements Text {
	
	public void draw() {
		
		System.out.println("Drwaing");

	}
	
	public void radius() {
		
		System.out.println("Radius");

	}

	public static void main(String[] args) {
		
		Fonttextchild F = new Fonttextchild();
		
		F.draw();
		
		F.radius();

	}

}
