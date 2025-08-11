package pack2;

import pack1.Class1;

public class DiffPacksubclass extends Class1{
	
	public void create() {
		
		System.out.println("creating in sub class");
	}
	public static void main(String[] args) {
		
		DiffPacksubclass obj = new DiffPacksubclass();
		
		obj.create();
		obj.fetchEmployeeName();
		obj.fetchEmployeeID();
		obj.fetchEmployeedept();
		obj.fetchCustomerName();
		obj.fetchCustomerID();
		obj.fetchCustomerdept();	
	}
		
}
	