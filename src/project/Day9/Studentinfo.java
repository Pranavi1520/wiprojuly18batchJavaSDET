package project.Day9;

public class Studentinfo {
    //student data
	public String studentName = "priya";
	int studentid = 504;
	public static String studentSec = "AB";
	public void fetchstudentdetails() {
		//local variables
		String studentdept="CSE";
		 System.out.println(studentName);
		 System.out.println(studentid);
		 System.out.println(studentSec);
	}
	public static void main(String[] args) {
		Studentinfo sd = new Studentinfo();
		sd.fetchstudentdetails();

	}

}
