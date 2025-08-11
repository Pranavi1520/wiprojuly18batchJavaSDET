package labsession24;

abstract class Student {

		abstract void getGrade();
	}
class EngineeringStudent extends Student{
		
		void getGrade() {
		
		String StudName = "priya";
		int rollno = 508;
		String grade = "A++";
		System.out.println("Engineering Student"+StudName);
		System.out.println("Engineering Student"+rollno);
	}

}
class MedicalStudent extends Student{
		
		void getGrade(){
			
			String StudName = "Heidi";
			int rollno = 345;
			String grade = "B+";
			System.out.println("Medical Student"+StudName);
			System.out.println("Medical Student"+rollno);
		}
}
	public class Abstraction4{
		public static void main(String[] args) {
			
			Student ES = new EngineeringStudent();
			Student MS = new MedicalStudent();
			
			ES.getGrade();
			MS.getGrade();
			
		}

	}



