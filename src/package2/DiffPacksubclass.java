package package2;

import package1.Class1;

public class DiffPacksubclass extends Class1{
	
	public void create() {
		
		System.out.println("creating in sub class");
	}

	public static void main(String[] args) {
		
		DiffPacksubclass obj = new DiffPacksubclass();
		
		obj.create();//own
		
		obj.display();//inherited
		
		obj.fetchRollno();
		
	}

}
