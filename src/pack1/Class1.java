package pack1;

public class Class1 {
	
	//private method
	private static String StudName = "Adi";
    
	private static String StudID = "549";
	
	private static String Studdept = "IT";
	
	private void fetchStudName() {
		System.out.println("The student name is"+StudName);
	}		
	private void fetchStudID() {
		System.out.println("The StudentID is"+StudID);
		}
	private void fetchStuddept() {
		System.out.println("The Studentdept is"+Studdept);
		}
	
	//protetecd method
	String CustomerName = "Diya";
	
	int CustomerID = 508;
	
	String Customerdept = "SFI";
	
	protected void fetchCustomerName() {
		
		System.out.println("The customer name is"+CustomerName);
		
	}
	protected void fetchCustomerID() {
		System.out.println("The customerID is"+CustomerID);

	}
	protected void fetchCustomerdept() {
		System.out.println("The customerdept is"+Customerdept);

	}
	
	//deafault method
	String GameName = "Hockey";
	int GameID = 908;
	String GameType = "Indiviual";
	
	void fetchGameName() {
		System.out.println("The GameName is "+GameName);
	}
	
	void fetchGameID() {
		System.out.println("The GameID is "+GameID);
	}

	void fetchGameType() {
		System.out.println("The GameName is "+GameType);
	}
    
	//public method
	String EmployeeName = "Rani";
	int EmployeeID = 687;
	String Employeedept = "Cash";
	
	public void fetchEmployeeName() {
		System.out.println("The EmployeeName is "+EmployeeName);

	}
	public void fetchEmployeeID() {
		System.out.println("The EmployeeID is "+EmployeeID);

	}
	public void fetchEmployeedept() {
		System.out.println("The Employeedept is "+Employeedept);

	}
	public static void main(String[] args) {
		
		Class1 obj = new Class1();
		
		obj.fetchStudName();
		obj.fetchStudID();
		obj.fetchStuddept();
		obj.fetchCustomerName();
		obj.fetchCustomerID();
		obj.fetchCustomerdept();
		obj.fetchGameName();
		obj.fetchGameID();
		obj.fetchGameType();
		obj.fetchEmployeeName();
		obj.fetchEmployeeID();
		obj.fetchEmployeedept();

	}

}
