package IO;

import java.util.Scanner;

public class readingfromkeyboardeg {

	public static void main(String[] args) {
	
		//creating the scanner class
		
		Scanner scn = new Scanner(System.in);
		
		//enter first name
		
		System.out.println("Enter the first number");
		
		int a = scn.nextInt();
		
		System.out.println("enter the second number");
		
		int b = scn.nextInt();
		
		System.out.println("sum is"+" "+(a+b));
		
		scn.close();

	}

}
