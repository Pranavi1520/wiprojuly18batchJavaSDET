package package1;

public class SamePacksubclass extends Class1{
	
	public void read() {
		
		System.out.println("Reading in sub class");
	}

	public static void main(String[] args) {
		
		SamePacksubclass obj = new SamePacksubclass();
		
		obj.display();//inhertied
		
		obj.read();	//own
		
		obj.fetchemployeeID();
		
		obj.fetchRollno();
		
	}

}
