package collection;

import java.util.*;

public class Student implements Comparable<Student>{
	
	int rollNumber;
	String name;
	
	//constructor of the class to pass the parameters
	
	public Student(int rollNumber, String name) {

		this.rollNumber = rollNumber;
		this.name = name;
		
	}
	//Implement compareto method for natural ordering
	
	public int compareTo(Student s) {
		
		return this.rollNumber - s.rollNumber;
		
	}
	
	public String toString() {
		
	    return rollNumber + "_" + name;
	}
	//sort a list of students by rollno
    
	public static void main(String[] args) {
		
		List<Student> students = new ArrayList<>();
		
		students.add(new Student (103, "Ravi"));
		
		students.add(new Student (101, "Amit"));

		students.add(new Student (102, "Zara"));

		Collections.sort(students);
		
		for(Student s : students) {
			
			System.out.println(s);
		}
	}

}
