package project.Day11;

public class methods {
    //employee data
	//class level variables or the instance variables
	public String employeeName = "peter";
	int employeeid = 677887;
	public static String employeeBu="HR";
	public void fetchemployeedetails() {
		//local variables
		String employeeLoc="Blr";
		 System.out.println(employeeName);
		 System.out.println(employeeid);
		 System.out.println(employeeBu);
		 
	}
	public static void main(String[] args) {
		methods md = new methods();
		md.fetchemployeedetails();

	}

}
