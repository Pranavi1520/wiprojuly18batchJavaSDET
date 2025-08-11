package project.Day7;

import java.util.Scanner;

public class Exp3{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Enter a number to divide 100: ");
            int number = Integer.parseInt(scanner.nextLine());

            int result = 100 / 20;

            System.out.println("100 divided by " + number + " is: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Error: You can't divide by zero!");
        } catch (NumberFormatException e) {
            System.out.println("Error: Please enter a valid integer.");
        } finally {
            System.out.println("Operation completed.");
        }

        scanner.close();
    }
}

