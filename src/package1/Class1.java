package package1;

public class Class1 {
	   
	    //private method 
	    private static String employeeSalary = "5666787";
	    
	    private void fetchsalary() {
	    	
	    	System.out.println("The employee salary is"+employeeSalary);
	    }
        //public method
	    public void display() {
	    	
		System.out.println("Displaying the data");
	    }
	    //default variable
	    
	    int employeeID = 77887;
	    
	    //default method
	    
	    void fetchemployeeID() {
	    	
	    	System.out.println("The employee id is" +employeeID);
	    }
	    //protected variable
	    
	    int Rollno = 549;
	    
	    //protected method
	    
	    protected void fetchRollno() {
	    	
	    	System.out.println("The Rollno"+Rollno);
	    }
		public static void main(String[] args) {
			
			Class1 obj = new Class1();
			
			obj.display();
			
			obj.fetchsalary();
			
			obj.fetchemployeeID();
			
			obj.fetchRollno();
		
	}
}
