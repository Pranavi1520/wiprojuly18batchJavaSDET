package project.Day6;

public class InterfaceChild implements Interface1{
	
	public void display() {
		
		System.out.println("Displaying in child class");
	}

	public static void main(String[] args) {
		
		InterfaceChild obj = new InterfaceChild();
		
		obj.display();
		
		Interface1.write();
		
		obj.show();
		
		System.out.println(employeename);
		System.out.println(employeeID);

	}

}
