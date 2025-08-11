package package1;

public class SamePackNonsubclass {
	
	public void write() {
		System.out.println("writing in sub class");
	}
	public static void main(String[] args) {
		Class1 obj = new Class1();
		
		SamePackNonsubclass obj1 = new SamePackNonsubclass();
		
		obj1.write();
		
		obj.display();
		
		obj.fetchemployeeID();
		
		obj.fetchRollno();
	}
		
		
}
