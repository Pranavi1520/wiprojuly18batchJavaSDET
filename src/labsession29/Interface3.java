package labsession29;

import labsession30.Intefacethree;

class main implements Intefacethree {
	
double balance;
 
final double interestRate = 0.7; 

public main(double initialBalance) {
	 
     this.balance = initialBalance;
 }

 public void deposit(double amount) {
	 
     balance += amount;
     
     System.out.println("main Deposited " + amount);
 }

 public void withdraw(double amount) {
	 
     if (amount <= balance) {
    	 
         balance -= amount;
         
         System.out.println("main Withdrawn " + amount);
     } 
     else {
         System.out.println("main Insufficient funds");
     }
 }

 public void calculateInterest() {
	 
     double interest = balance * interestRate;
     
     balance += interest;
     
     System.out.println("main Interest of " + interest);
 }

 public void viewBalance() {
	 
     System.out.println("main Account Balance" + balance);
 }

 
 public void lockForFixedPeriod(int years) {
	 
     System.out.println("main account locked for " + years);
 }
}

class CurrentAccount implements Intefacethree {
	
private double balance;

private final double overdraftLimit = 5000;

public CurrentAccount(double initialBalance) {
	
     this.balance = initialBalance;
 }

 public void deposit(double amount) {
	 
     balance += amount;
     
     System.out.println("Current Deposited " + amount);
 }

 public void withdraw(double amount) {
	 
     if (amount <= balance + overdraftLimit) {
    	 
         balance -= amount;
         
         System.out.println("Current Withdrawn" + amount);
     } 
     else {
    	 
         System.out.println("Current Overdraft limit exceeded");
     }
 }

 public void calculateInterest() {
	 
     System.out.println("Current No interest on current accounts");
 }

 public void viewBalance() {
	 
     System.out.println("Current Account Balance" + balance);
 }


 public void requestOverdraftIncrease(double newLimit) {
	 
     System.out.println("Requested overdraft increase" + newLimit);
 }
}

public class Interface3 {
	
public static void main(String[] args) {
	
     main mymain = new main(5000);
     mymain.viewBalance();

     CurrentAccount current = new CurrentAccount(1000);
     current.viewBalance();
     
 }
}

