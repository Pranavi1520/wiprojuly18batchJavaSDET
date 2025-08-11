package project.Day6;

public interface Interface1 {
	
	//abstract methods
	
	abstract void display();
	
	//static
	
	static void write() {
		
		System.out.println("writing in interface");
	}
	
	//default
	default void show() {
		
		System.out.println("showing");
	}
	
	public static final String employeename = "Jaya";
	
	int employeeID = 6767;

}
