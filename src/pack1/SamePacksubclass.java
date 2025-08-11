package pack1;

public class SamePacksubclass extends Class1 {
	
			public void read() {
				
				System.out.println("Reading in sub class");
			}

	public static void main(String[] args) {
		
		SamePacksubclass obj = new SamePacksubclass();
		
		obj.read();
		obj.fetchCustomerName();
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
