package labsession29;

class Employee {

 private String name;
 private int id;
 private double salary;

 public Employee(String name, int id, double salary) {
	 
     this.name = name;
     
     this.id = id;
     
     setSalary(salary);
 }

 public void setSalary(double salary) {
	 
     {
    	 
         this.salary = salary;
         
     } 
 }

 public void displayDetails() {
	 
     System.out.println("Name " + name);
     
     System.out.println("ID" + id);
     
     System.out.println("Salary" + salary);
 }
}

public class Encap1 {
	
public static void main(String[] args) {
	
     Employee e = new Employee("Soha", 309, 90000);
     
     e.displayDetails();
 }
}

		
