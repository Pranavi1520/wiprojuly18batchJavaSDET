package pack2;

import pack1.Class1;

public class DiffPackNonsubclass {

		public void print() {
			
			System.out.println("printing the data");
		}

	public static void main(String[] args) {
		Class1 obj=new Class1();
		
		DiffPackNonsubclass obj1=new DiffPackNonsubclass();
		
		obj1.print();
		obj.fetchEmployeeName();
		obj.fetchEmployeeID();
		obj.fetchEmployeedept();
		
	}

}
