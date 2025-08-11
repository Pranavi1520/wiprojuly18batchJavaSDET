package labsessionaug1;

import java.util.Scanner;

public class inputconsoleeg {

	    public static void main(String[] args) {
	        
	        Scanner scanner = new Scanner(System.in);

	        System.out.print("Enter Name ");
	        
	        String name = scanner.nextLine();

	        System.out.println("How are you "+name);
	        
	        scanner.close();
	    }
	}
