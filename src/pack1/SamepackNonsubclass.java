package pack1;

public class SamepackNonsubclass {
	
	public void write() {
		System.out.println("writing in sub class");
	}

	public static void main(String[] args) {
		Class1 obj = new Class1();
		
		SamepackNonsubclass obj1 = new SamepackNonsubclass();
		
		obj1.write();
		obj.fetchCustomerName();
		obj.fetchCustomerID();
		obj.fetchCustomerdept();
		obj.fetchGameName();
		obj.fetchGameID();
		obj.fetchGameName();
		obj.fetchEmployeeName();
		obj.fetchEmployeeID();
		obj.fetchEmployeedept();
		
	}

}
