package labsession24;

abstract class BankAccount {
	String accountNumber = "A7890B09";
	double bal = 65000; 

	void printBalance() {
		System.out.println("Account Number" + accountNumber);
		System.out.println("Current Balance " + bal);
	}

	abstract double calculateInterest();
}

class SavingsAccount extends BankAccount {
	double interestRate = 1.0; 

	double calculateInterest() {
		return bal* interestRate;
	}
}

class FixedDepositAccount extends BankAccount {
	double interestRate = 0.075; 

 	double calculateInterest() {
     	return bal * interestRate;
 	}
}

public class Abstraction1 {
	public static void main(String[] args) {
     
		SavingsAccount sav = new SavingsAccount();
		FixedDepositAccount fd = new FixedDepositAccount();

		sav.printBalance();
		System.out.println("Interest " + sav.calculateInterest());

		fd.printBalance();
		System.out.println("Interest " + fd.calculateInterest());
	}
}
