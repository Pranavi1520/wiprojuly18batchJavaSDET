package collection;

import java.util.*;

public class SalaryComparatorSubclass implements Comparator<Empeg> {

    public int compare(Empeg e1, Empeg e2) {
    	
    	return (int) (e1.salary - e2.salary);
        
    }

    public static void main(String[] args) {
    	
        List<Empeg> employees = new ArrayList<>();

        employees.add(new Empeg(101, "Ravi", 85000));
        
        employees.add(new Empeg(102, "Amit", 90000));
        
        employees.add(new Empeg(103, "Zara", 70000));

        Collections.sort(employees, new SalaryComparatorSubclass());

        for (Empeg e : employees) {
        	
            System.out.println(e);
        }
    }
}
