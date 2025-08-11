package labsession;

public class grade {
	public static void main(String[] args) {
		int marks = 85;  
        if (marks >= 90 && marks <= 100) {
            System.out.println("G: A");
        } else if (marks >= 75 && marks <= 89) {
            System.out.println("G: B");
        } else if (marks >= 60 && marks <= 74) {
            System.out.println("G: C");
        } else if (marks >= 40 && marks <= 59) {
            System.out.println("G: D");
        } else if (marks < 40 && marks >= 0) {
            System.out.println("G: Fail");
        } else {
            System.out.println("Invalid marks!");
        }
    }	

	}


